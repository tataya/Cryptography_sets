import java.math.*;


  class BigIntegerdemo{
        BigInteger bi1,bi2,bi3;

        public  void algorithm(){
            /*
            a mod b
            */
            bi1 = new BigInteger("59");
            bi2 = new BigInteger("4");

            bi3 = bi1.mod(bi2);


            String str = bi1 + " mod " + " is " + bi3;
            System.out.println(str);
        }

        public void algorithm1(){
            /**
             * a^-1 mod b //a的逆mod b
             */
            bi1 = new BigInteger("9");
            bi2 = new BigInteger("35");

            bi3 = bi1.modInverse(bi2);

            String str = bi1 + " ^-1 mod " + " is " + bi3;
            System.out.println(str);

        }

        public void algorithm2(){
            BigInteger exponent = new BigInteger("3");

            bi1 = new BigInteger("11");
            bi2 = new BigInteger("20");
            bi3 = bi1.modPow(exponent,bi2);

            String str = bi1 + "^" + exponent + " mod " +bi2 + " is "+ bi3;
            System.out.println(str);
        }
    }

    public class Demo_mod{
    public static void main(String [] args){
        BigIntegerdemo demo = new BigIntegerdemo();
        demo.algorithm();
        demo.algorithm1();
        demo.algorithm2();

        
    }
}
