package com.codes;
import java.math.BigInteger;
import java.security.SecureRandom;
 /**
  * 功能介绍：
  * PollardRho算法的实现
  * 大整数分解
  * 贡献者：汪青   
  *
  */

class PollardRho {
    private final static BigInteger ZERO = new BigInteger("0");
    private final static BigInteger ONE  = new BigInteger("1");
    private final static BigInteger TWO  = new BigInteger("2");
    private final static SecureRandom random = new SecureRandom();

    public static BigInteger rho(BigInteger N) {
        BigInteger divisor;
        BigInteger c  = new BigInteger(N.bitLength(), random);
        BigInteger x  = new BigInteger(N.bitLength(), random);
        BigInteger xx = x;

        // check divisibility by 2
        if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;

        do {
            x  =  x.multiply(x).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            divisor = x.subtract(xx).gcd(N);
        } while((divisor.compareTo(ONE)) == 0);

        return divisor;
    }

    public static void factor(BigInteger N) {
        if (N.compareTo(ONE) == 0) return;
        if (N.isProbablePrime(20)) { System.out.println(N); return; }
        BigInteger divisor = rho(N);
        factor(divisor);
        factor(N.divide(divisor));
    }

 
    public static void main(String[] args) {
        BigInteger N = new BigInteger("1866118179419651722916920416204664114241146457649538375577948064153687376094507211801943140520961314861627227968077832830015802925840716513558188112547163898338223925164636419172943557937876751105461308706779332586634590186071972237206900431147054428069728368279880844855127920084768434351199909810146052268537800621218772895479024634728134674207002557130526600174681");
        factor(N);
    }
}