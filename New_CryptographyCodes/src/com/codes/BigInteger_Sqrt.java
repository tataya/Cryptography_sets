package com.codes;
import java.math.*;
import java.math.BigInteger;  
/**
 * 功能介绍：
 * 由于java.math.BigInteger包中没有提供开方计算，但Fermat算法需要开方运算；所以编写了一个BigInteger_sqrt()函数
 * 输入一个字符串型数字，返回该字符串的开方后的值；
 * 字符串和BigInteger互转很简单，不重复！
 */
public class BigInteger_Sqrt  
{  
    public static String sqrt(String num)  
    {  
        BigInteger b=new BigInteger(num);  
        //不用多解释了吧  
        if(b.compareTo(BigInteger.ZERO)<0)  
            return "不是非负数";  
      
        String sqrt="0"; //开方结果  
        String pre="0"; //开方过程中需要计算的被减数  
        BigInteger trynum; //试商，开放过程中需要计算的减数  
        BigInteger flag;  //试商，得到满足要求减数的之后一个数  
        BigInteger _20=new BigInteger("20"); //就是20  
        BigInteger dividend; ///开方过程中需要计算的被减数  
        BigInteger A;  //(10*A+B)^2=M  
        BigInteger B;    
        BigInteger BB;  
          
        int len=num.length(); //数字的长度  
          
        if(len%2==1)  //长度是奇数的画，首位补上1个0凑成偶数位  
        {  
            num="0"+num;  
            len++;  
        }  
  
        for(int i=0;i<len/2;++i) //得到的平方根一定是len/2位  
        {  
            dividend=new BigInteger(pre+num.substring(2*i,2*i+2));    
            A=new BigInteger(sqrt);  
            for(int j=0;j<=9;++j)  
            {  
                B=new BigInteger(j+"");  
                BB=new BigInteger((j+1)+"");  
                  
                trynum=_20.multiply(A).multiply(B).add(B.pow(2));  
                flag=_20.multiply(A).multiply(BB).add(BB.pow(2));;  
                      
                //满足要求的j使得试商与计算中的被减数之差为最小正数  
                if(trynum.subtract(dividend).compareTo(BigInteger.ZERO)<=0  
                        &&flag.subtract(dividend).compareTo(BigInteger.ZERO)>0)  
                {  
                    sqrt+=j;  //结果加上得到的j  
                    pre=dividend.subtract(trynum).toString(); //更新开方过程中需要计算的被减数  
                    break;  
                }  
            }         
        }  
        return sqrt.substring(1);  
    }  
      
    /*
    public static void main(String[] args)  
    {  
        System.out.println(BigInteger_Sqrt.sqrt("12345678901234567890"));  
        System.out.println(Math.sqrt(1234567890123456789l));  
    }  
    */
} 