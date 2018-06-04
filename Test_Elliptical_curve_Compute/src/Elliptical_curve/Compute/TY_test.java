package Elliptical_curve.Compute;

import java.math.BigInteger;
import java.util.Random;

public class TY_test {
	static BigInteger n = new BigInteger("2242044697923530526327168023666147278595878794471547916812025935008168488571793766565078926794088150810687244192287853049583868555762351578847707024041577430891347758712503402726265381194171365954718076365609870052090890978591453736937144810745241547300251777028347386821733153792485348292918131286130163733757389009314794231301344910357138785449113193");
	static BigInteger b;
	BigInteger b0;
	BigInteger b1;
	BigInteger b2;
	BigInteger b3;
	BigInteger c,c0,c1;
	BigInteger l = new BigInteger("1");
	BigInteger p1 = new BigInteger("4");
	BigInteger p2 = new BigInteger("27");
	
	//? k的取值到底怎么取？
	
	static BigInteger a= new BigInteger (1024, new Random());
	static BigInteger a1= new BigInteger (1024, new Random());//a1:阿尔法
	static BigInteger a2= new BigInteger (1024, new Random());//a2:贝塔
	/**
	 * a_b_test()，用来产生椭圆曲线方程的参数a & b；
	 */
	public  void a_b_test() {
		//(b = a2^2 - a1^3 - a*a).mod(n)
			 b1 = a2.multiply(a2);
			 b2 = a1.pow(3);
			 b3 = a.multiply(a1);
			 b0 = b1.subtract(b2).subtract(b3);
			 b = b0.mod(n);
		//令c = 4*a^3 +27*b^2
			 c0 = a.pow(3).multiply(p1);
			 c1 = b.pow(2).multiply(p2);
			 c = c0.add(c1);
			 
			 //如果c与n互素
			 if(c.gcd(n).compareTo(l)==0) {
				 System.out.println("a = " + a );
				 System.out.println("b = " + b );
				 
			 }
	}
	BigInteger x2,y2,x;
	BigInteger to = new BigInteger("2");//测试
	BigInteger d = new BigInteger("0");//初始化d
	BigInteger d0 = new BigInteger("0");//初始化d
	BigInteger d1 = new BigInteger("0");
	
	//因为 n = gcd(0,n)，所以对这种情况单独考虑
	
	BigInteger e,e0,e1,e2;//e 表示伽马 e = (y1 - y2)(x1 -x2)-1
	BigInteger three = new BigInteger("3");
	
	public void TY_compite(BigInteger x2,BigInteger y2) {
		
		//Q(x2,y2,1)
		
		//定义加法运算
		x = a1.subtract(x2);
		d = x.gcd(n);
		if(d.compareTo(l)>0 && d.compareTo(n)<0) //1<d<n
			{System.out.println("d1 = " + d); System.exit(0);}
		if(d.compareTo(l)==0) {
			//System.out.println("Q = " + x2 + " , " + y2);
			Alter_Test.Alter_1(a1,a2,x2,y2);
			
		}
		if(d.compareTo(n)==0) {//a1 =x1
			d1 = a2.add(y2);  //a2 + y2
			d0 = d1.gcd(n);
			if(d0.compareTo(l)>0 && d0.compareTo(n)<0)
				{System.out.println("d2 = " + d0); System.exit(0);}
			if(d0.compareTo(n)==0)
				{System.out.println("Break!");  System.exit(0);}//退出程序
			if(d0.compareTo(l)==0) {
				Alter_Test.Alter_2(a1,a2,x2,y2);
			}
			
		}
	}
	
	//循环算法_迭代算法
	public void EC_Compute() {
		long k = 10240000;
		//P = (a1,a2,1)     大整数k = i!
				//Q = k*P    k=1,2,3...
				x2 = a1; y2 = a2;
		long i;
		for( i=0;i<k;i++) {
			TY_compite(x2,y2);
			if(d.compareTo(l)==0) {
				x2 = Alter_Test.x3;
				y2 = Alter_Test.y3;
			}
			if(d.compareTo(n)==0) {
				x2 = Alter_Test.x31;
				y2 = Alter_Test.y31;
			}
			if(i==k) {
				System.out.println("运行结束！" );
				System.out.println("R,X3 =" + x2);
				System.out.println("R,y3 =" + y2);
			}
		}
		
		
	}
	
	
}
