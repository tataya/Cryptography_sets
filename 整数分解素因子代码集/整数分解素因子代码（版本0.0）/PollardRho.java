import java.math.BigInteger;  
import java.security.SecureRandom;  
      
class PollardRho  
{  
    private final static BigInteger ZERO = new BigInteger("0");  
    private final static BigInteger ONE  = new BigInteger("1");  
    private final static BigInteger TWO  = new BigInteger("2");  
    private final static SecureRandom random = new SecureRandom();  
  
    public static BigInteger rho(BigInteger N)   
    {  
        BigInteger divisor;  
        BigInteger c  = new BigInteger(N.bitLength(), random);  
        BigInteger x  = new BigInteger(N.bitLength(), random);  
        BigInteger xx = x;  
  
        if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;  
  
        do   
        {  
            x  =  x.multiply(x).mod(N).add(c).mod(N);  
            xx = xx.multiply(xx).mod(N).add(c).mod(N);  
            xx = xx.multiply(xx).mod(N).add(c).mod(N);  
            divisor = x.subtract(xx).gcd(N);  
        } while((divisor.compareTo(ONE)) == 0);  
  
        return divisor;  
    }  
  
    public static void factor(BigInteger N)   
    {  
        if (N.compareTo(ONE) == 0) return;  
        if (N.isProbablePrime(100))   
        {   
            System.out.println(N);   
            return;   
        }  
        BigInteger divisor = rho(N);  
        factor(divisor);  
        factor(N.divide(divisor));  
    }  
   
    public static void main(String[] args)   
    {  
        BigInteger N = new BigInteger("298777079680636209728926753957151534560921684339894725163656346441015377896041311169310959917171700706622085676826928556518363105076218043402519861108884785655277921109447616047979259115290265284384151036883100749922693173993355808366922676333229835998998497712492287847117477480037575980851247778265980034106283555720558204023500207676048578837876927418180945214920194972851554780233917446851793705191199191708506603506807978474027");  //这里4620是一个大数，是我随便找的几个素数之积
        factor(N);  
    }  
} 
