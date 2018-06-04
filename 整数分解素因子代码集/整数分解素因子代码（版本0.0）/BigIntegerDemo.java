import java.math.BigInteger;

public class BigIntegerDemo{

public static void main(String[] args) { 
	BigInteger n1,n2,n3,d,i,j; 
	BigInteger B=new BigInteger("200");
	BigInteger n=new BigInteger("298777079680636209728926753957151534560921684339894725163656346441015377896041311169310959917171700706622085676826928556518363105076218043402519861108884785655277921109447616047979259115290265284384151036883100749922693173993355808366922676333229835998998497712492287847117477480037575980851247778265980034106283555720558204023500207676048578837876927418180945214920194972851554780233917446851793705191199191708506603506807978474027");
	BigInteger a=new BigInteger("2");
	n3=new BigInteger("1");
	for ( i = new BigInteger("2"); i.compareTo(B) < 0; i = i.add(new BigInteger("1")))
	{n1=a;
	for ( j = new BigInteger("2"); j.compareTo(i) < 0; j = j.add(new BigInteger("1"))){
    a=a.multiply(n1);
	a=a.mod(n);
	}}
    n2=a.subtract(n3);
    d= n2.gcd(n);
	if(d.compareTo(n3)>0&&d.compareTo(n)<0)
    	System.out.println("yinzi"	+d);
    else System.out.println("bushi");
	
}}