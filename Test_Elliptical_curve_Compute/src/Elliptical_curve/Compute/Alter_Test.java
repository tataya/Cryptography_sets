package Elliptical_curve.Compute;

import java.math.BigInteger;
import java.util.Random;

public class Alter_Test {
	
	static BigInteger e,e0,e1,e2;//e 表示伽马 e = (y1 - y2)(x1 -x2)-1
	static BigInteger x3,y3;

	static BigInteger n = new BigInteger("2242044697923530526327168023666147278595878794471547916812025935008168488571793766565078926794088150810687244192287853049583868555762351578847707024041577430891347758712503402726265381194171365954718076365609870052090890978591453736937144810745241547300251777028347386821733153792485348292918131286130163733757389009314794231301344910357138785449113193");
	
	public static void Alter_1(BigInteger a1,BigInteger a2,BigInteger x2,BigInteger y2) {  //Q =2P,3P;想要的改变其x，y的函数
		e0 = y2.subtract(a2);
		e2 = x2.subtract(a1);
		Inverse.kEulid(n,e2);
		e1 = Inverse.y;
		e = (e0.multiply(e1)).mod(n);
		x3 = (e.pow(2).subtract(a1).subtract(x2)).mod(n);
		y3 = ((a1.subtract(x3)).multiply(e).subtract(a2)).mod(n);
		//R(x3,y3,1)
		//System.out.println("R,gcd()=1 ~ = " + " x3 = " + x3);
		//System.out.println("R,gcd()=1 ~ = " + " y3 =" + y3);
		
	}
	
	static BigInteger three = new BigInteger("3");
	static BigInteger x31,y31;
	public static void Alter_2(BigInteger a1,BigInteger a2,BigInteger x2,BigInteger y2) {
		e0 = ((a1.pow(2)).multiply(three)).add(TY_test.a);
		e2 = a2.add(y2);
		Inverse.kEulid(n,e2);
		e1 = Inverse.y;
		e = (e0.multiply(e1)).mod(n);
		x31 = (e.pow(2).subtract(a1).subtract(x2)).mod(n);
		y31 = ((a1.subtract(x31)).multiply(e).subtract(a2)).mod(n);
		//R(x3,y3,1)
		//System.out.println("R,gcd()=1,N ~ = " + " x3 = " + x31);
		//System.out.println("R,gcd()=1,N ~ = " + " y3 =" + y31);
		
	}

}
