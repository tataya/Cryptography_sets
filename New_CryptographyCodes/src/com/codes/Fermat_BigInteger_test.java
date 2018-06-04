package com.codes;
import java.math.BigInteger;
import com.codes.BigInteger_Sqrt;
/**
 * 功能介绍：
 * fermat算法的实现
 * 利用fermat算法对大整数进行分解！效果很差，实际操作中对300多位的十进制数分解效果十分不理想，结果并未跑出来！
 * 引用了BigInteger_Sqrt.java文件
 * 贡献者：赵云龙
 */

public class Fermat_BigInteger_test {
	public static void fermat(String num0) {
		String x0;
		//初始化
		BigInteger y = new BigInteger("0");
		BigInteger y2 = new BigInteger("0");
		
		BigInteger x1 = new BigInteger("1");
		
		x0 = BigInteger_Sqrt.sqrt(num0);
		BigInteger x = new BigInteger(x0);
		//测试
		System.out.println("x=" + x);
		
		BigInteger num = new BigInteger(num0);
		//BigInteger x2 = new BigInteger("0");
		//x2 = x.multiply(x);
		if(x.multiply(x).compareTo(num)<0) {
			x=x.add(x1);
			System.out.println(" circle x=" + x) ;
		}
		
		System.out.println("new x=" + x) ;//测试
		while(true) {
			y2 = x.multiply(x).subtract(num);
			String y3 = y2.toString();	
			String y4 = BigInteger_Sqrt.sqrt(y3);	
			y = new BigInteger(y4);		

			if(y.multiply(y).compareTo(y2) ==0) {
				break;
			}
			
		}
		BigInteger m1;
		BigInteger m2;
		m1 = x.add(y);
		m2 = x.subtract(y);
		System.out.println("x+y=" + m1);
		System.out.println("x-y=" + m2);
			
			
			
	} 
	 public static void main(String[] args)  {
		 String n="1866118179419651722916920416204664114241146457649538375577948064153687376094507211801943140520961314861627227968077832830015802925840716513558188112547163898338223925164636419172943557937876751105461308706779332586634590186071972237206900431147054428069728368279880844855127920084768434351199909810146052268537800621218772895479024634728134674207002557130526600174681";
	
		 BigInteger n0 = new BigInteger(n);
		 /**
		  * 
		  
		 //构造循环体，进行降维，可惜失败！
			 for(int i=0;i<100;i++) {
				 BigInteger a0 = new BigInteger("3");
				 BigInteger n1 = n0.divide(a0);
				 n0 = n1;
				 //System.out.println("疑是剩余因子：" +i+"= "+ n1);
				 if(n1.multiply(a0).compareTo(n0) ==0) {
					 System.out.println("剩余因子 "+i+" = " +n1 );
				 }
			 }
			 */
			 fermat(n);//测试分解大整数
		 
			 
		 
	 }


}
