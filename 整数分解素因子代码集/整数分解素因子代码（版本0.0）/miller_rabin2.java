import java.math.BigInteger;
import java.util.Random;

public class miller_rabin2{ 

	public static void main(String[] args) { 
		BigInteger i,b,m,lunci,v,w,z,f,u;
		BigInteger c=new BigInteger("2");
		BigInteger d=new BigInteger("0");
		BigInteger e=new BigInteger("1");

		u=new BigInteger("0");//注：需要初始化！u、v、f等等是对象，对象需要初始化

		lunci=new BigInteger("2");
		BigInteger a=new BigInteger("121");
		if (a.compareTo(c)<0){System.out.println("bushi1");
		System.exit(0);}
		
		if  (!a.equals(c) & a.mod(c).equals(d)){System.out.println("bushi2");
		System.exit(0);}

	
		m=a.subtract(e); 
		while (m.mod(c).equals(d)){m=m.divide(c);}
	
		for  ( i = new BigInteger("0"); i.compareTo(lunci) < 0; i = i.add(new BigInteger("1")))
		{b= new BigInteger (2000, new Random());
		w=m;
		z=m;
		BigInteger q1=new BigInteger("1");
		BigInteger p1=b;
		while(w.compareTo(d)>0){
		if (w.mod(c).equals(e))
				q1=q1.multiply(p1);
				q1=q1.mod(a);
				p1=p1.multiply(p1);
				p1=p1.mod(a);
				w=w.divide(c);
				}
			v=q1.mod(a);
		while (!a.subtract(e).equals(z)&& !v.equals(e) && !a.subtract(e).equals(v) )
		{
				BigInteger q2=d;
				BigInteger p2=v.mod(a);
			f=v;
			while (f.compareTo(d)>0){
				if (f.mod(c).equals(e))
				{q2=q2.add(p2);
				q2=q2.mod(a);}
				p2=p2.multiply(c);
				p2=p2.mod(a);
				f=f.divide(c);}
			 u=q2.mod(a);
			//System.out.println("u:"+u);
				z=z.multiply(c);
				}		
				//System.out.println("u:"+u);
			if ( !a.subtract(e).equals(u)&  z.mod(c).equals(d) )  /*u没有定义？在循环里u=q2.mod(a)已经定义了啊*/
			{System.out.println("bushi3");
			System.exit(0);}}
			
		System.out.println("shi");
			}}
	

