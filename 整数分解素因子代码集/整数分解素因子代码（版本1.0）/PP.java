import java.math.BigInteger;
import java.util.Random;
public class PP { 
	public static	BigInteger c=new BigInteger("2");
	public static   BigInteger d=new BigInteger("0");
	public static   BigInteger e=new BigInteger("1");
     /*	PD函数返回true表示是素数返回false表示不是素数*/
static boolean PD(BigInteger a){
		BigInteger b= new BigInteger (2000, new Random());
		b=b.mod(a);//随机生成b属于｛0,...,a-1}
		BigInteger	m=a.subtract(e);
		int s=0;
	    while (m.mod(c).equals(d)){
		++s;
		m=m.divide(c);}//提出因子2   得到 a-1=m*2^s
	 BigInteger x = b.modPow(m,a);//x=a^m (mod n)
	 if(x.compareTo(e)==0||x.compareTo(a.subtract(e))==0)
		 return true;   
	 while(s-->0){x=x.multiply(x).mod(a);
	 if(x.compareTo(a.subtract(e))==0)
		return true;}
	 return false;}
     /*测试10次使错误率保持小于4^(-10)以下*/
 static boolean MillerRabin(BigInteger a){
	  	final int Times = 10;
		for(int i=0;i<Times;i++)
		{if(PD(a))return  true;
		}
		return false;}
			
public static void main(String[] args) { 
		BigInteger a=new BigInteger("1234567891");//a是要判断的数
		if (a.compareTo(c)<0)
		{System.out.println("bushi1");
		System.exit(0);}//a<2  a不是素数
		if  (!a.equals(c) & a.mod(c).equals(d))
		{System.out.println("bushi2");
		System.exit(0);}//a！=2且a%2==0 a不是素数
		 if (MillerRabin(a)){
	            System.out.println("shisushu");
	        }
	        else{
	            System.out.println("bushisushu");}}

}