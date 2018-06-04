package com.codes;

import java.math.BigInteger;
import java.io.IOException;
/**
 * 功能介绍：
 * 利用Pollard-1大整数分解算法和Miller_Rabin素数测定算法来判断整数n分解的素因子数
 * 调用C_Pollard_1.java和Miller_Rabin.java文件！
 * 贡献者：赵云龙、汪青
 */

public class Test_code_2{

   

	public static void main (String [] args) throws IOException {
        String n0 = "1422403627536787805663639317360128069413707832898267008196724611761145558532058026349693864110390400462375009439745736488261542112462797809486684713186578535814850948463857870665920556568125342414456008657690098389018143159766678301544429822632223592585508470607493628057067972351572685880999621552304954257494795605811129471951598758043804039090018314556203204739999357173954010717111";
        BigInteger n = new BigInteger(n0);
        
        /**
         * 设定B值，B值的选取依据：https://en.wikipedia.org/wiki/Pollard%27s_p_%E2%88%92_1_algorithm
        */
       // Pollard_1 Ptest = new Pollard_1();
        Pollard_1.Pollard_Algorithm(n);
       
        
        }
        
        

    }
