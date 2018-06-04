import java.math.*;//使用BigInteger类
import java.io.IOException;
/**
 * 本代码是对大整数n进行分解操作，采用Pollard的p-1方法
 */
 class Pollard_1{
    static BigInteger n1,n2,n3,d,i,j,f; 
    static BigInteger B = new BigInteger("2000");

    public static void Pollard_Algorithm(BigInteger n){
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
	
    //	System.out.println("yinzi1="	+d);
    //System.out.println("yinzi2="+f);
    }
	 
    else System.out.println("P_Bushi");
    }
    /**
     * 函数功能：
     * 将因子写入到文件Factor.txt
     */
    public static void outwrite() throws IOException {
        java.io.File file = new java.io.File("Factor.txt");
		if (file.exists()) {
			System.out.println("File already exists");
            //System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //write formatted output to the file!
		output.println(d);
		output.println(f);
		output.close();

		
    }

}
