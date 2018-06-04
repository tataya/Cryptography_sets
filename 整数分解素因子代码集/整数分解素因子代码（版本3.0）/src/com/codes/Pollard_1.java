package com.codes;

 import java.math.*;//使用BigInteger类
 import java.io.IOException;


 /**
  * 本代码是对大整数n进行分解操作，采用Pollard的p-1方法
  */
  class Pollard_1{
     static BigInteger n1,n2,n3,d,i,j,f; 
     static BigInteger B = new BigInteger("2000");//初始化B值

     public static void Pollard_Algorithm(BigInteger n) throws IOException {
         BigInteger a=new BigInteger("2");
 	n3=new BigInteger("1");
 	for ( i = new BigInteger("2"); i.compareTo(B) < 0; i = i.add(new BigInteger("1")))
 	{n1=a;
 	for ( j = new BigInteger("2"); j.compareTo(i) < 0; j = j.add(new BigInteger("1"))){
     a=a.multiply(n1).mod(n);
 	
 	}}//a=a^B!mod(n)
     n2=a.subtract(n3);
     d= n2.gcd(n);//d=gcd(a-1,n)
 	if(d.compareTo(n3)>0&&d.compareTo(n)<0)
 		{f=n.divide(d);
 		
 		outwrite(d);
 		outwrite(f);
 		
 		//素因子测定
 		Miller_Rabin.MR(d);
		Miller_Rabin.MR(f);
     }
 	 
     else System.out.println("Bushi");
     }
     /**
      * 函数功能：
      * 将因子写入到文件Factor.txt
      */
     public static void outwrite(BigInteger factor) throws IOException {
     	/*
         java.io.File file = new java.io.File("Factor.txt");
 		if (file.exists()) {
 			System.out.println("File already exists");
             //System.exit(1);
         }
         */
     	java.io.FileWriter file = new java.io.FileWriter("Factor.txt", true);//true为追加，FALSE为覆盖
         java.io.PrintWriter output = new java.io.PrintWriter(file);
         //write formatted output to the file!
 		output.println(factor);
 		output.close();

 		
     }
     

 }
