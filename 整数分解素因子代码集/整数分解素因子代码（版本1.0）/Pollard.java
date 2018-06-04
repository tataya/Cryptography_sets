import java.math.BigInteger;

public class Pollard{

public static void main(String[] args) { 
	BigInteger n1,n2,n3,d,i,j,f; 
	BigInteger B=new BigInteger("5000");//  迭代B次
	BigInteger n=new BigInteger("1756053846598841646152677047417972998145982885751393917864310017049751267940939933480163982310405267885479740255131985472554798302190881107617396138940694152466808501924374701111776307095856701808267802520802205699712626561489224082813168768924568349338734429720528897186352834269727401341311179751627273566526820754542313456515228932796358438156645469753026391443302209727604123142015124882901");//待分解的数
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
	
    	System.out.println("yinzi1="	+d);
	System.out.println("yinzi2="+f);}
	 
    else System.out.println("bushi");
	
}}
