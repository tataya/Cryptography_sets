package com.codes;
import java.math.BigInteger;
import java.util.Random;



import java.io.IOException;
/**
 *目的：对因子进行素数测定
 *方法：Miller_Rabin方法
 *
 */
public class Miller_Rabin{
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
        return false;
    }  
    /**
     * 函数功能：
     * 用来判断一个因子是否为素数
     * 并将因子是素因子的数写入到Prime_Factor.txt
     */
    static void MR(BigInteger a) throws IOException {
        
        if (a.compareTo(c)<0)
            {System.out.println("Bushi_1");
            System.exit(0);}//a<2  a不是素数
            if  (!a.equals(c) & a.mod(c).equals(d))
            {System.out.println("Bushi_2");
            System.exit(0);}//a！=2且a%2==0 a不是素数
             if (MillerRabin(a)){
                    System.out.println("It is a prime factor!" );
                    M_outwrite(a);
                }
                else{
                    System.out.println("It not is a prime factor");
                    C_Pollard_1.Pollard_Algorithm(a);
                
            }
     }

     /**
      *  函数功能：将因子是素因子的数写入到Prime_Factor.txt
      */
      public static void M_outwrite(BigInteger a) throws IOException {
    	  
    	  java.io.FileWriter file = new java.io.FileWriter("Prime_Factor.txt", true);//true为追加，FALSE为覆盖
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //write formatted output to the file!
		output.println(a);
		
        output.close();
    }
    
}
