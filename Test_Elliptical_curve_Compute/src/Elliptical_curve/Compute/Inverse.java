package Elliptical_curve.Compute;
import java.math.BigInteger;
public class Inverse {
	
	static BigInteger x,y,q,n1,nw;
public static BigInteger kEulid(BigInteger n,BigInteger u) {
	
	  BigInteger o= new BigInteger("0");
	   BigInteger i= new BigInteger("1");
   
	if(u.equals(o)){x=i;y=o;q=n;}
	else {kEulid(u,n.mod(u));//error
	BigInteger temp=x;
	x=y;
	n1=n.divide(u).multiply(y);
	y=temp.subtract(n1);
	}
	return y;
	}//  y是u的逆元



 
/*public static void main(String[] args) {
	
	BigInteger n,u;

	n=new BigInteger("1023");
	u=new BigInteger("13");
	nw=kEulid(n,u);
	System.out.println("逆元"+nw);
	}*/

}
