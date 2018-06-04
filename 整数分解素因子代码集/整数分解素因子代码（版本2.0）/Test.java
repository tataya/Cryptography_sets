
import java.math.BigInteger;
import java.io.IOException;
import java.util.Scanner;
public class Test{

    public static void main (String [] args) throws IOException {
        String n0 = "298777079680636209728926753957151534560921684339894725163656346441015377896041311169310959917171700706622085676826928556518363105076218043402519861108884785655277921109447616047979259115290265284384151036883100749922693173993355808366922676333229835998998497712492287847117477480037575980851247778265980034106283555720558204023500207676048578837876927418180945214920194972851554780233917446851793705191199191708506603506807978474027";
        BigInteger n = new BigInteger(n0); 

        Pollard_1 Ptest = new Pollard_1();
        Ptest.Pollard_Algorithm(n);
        Ptest.outwrite();
        //     create a file instance   
        java.io.File file = new java.io.File("Factor.txt");
        //  create a scanner for file  
        Scanner input = new Scanner(file);

        //read data from file
        String d0="";
        while(input.hasNext()){
             d0 = input.nextLine();
             System.out.println(d0);
         /**
         * 判断一个因子是否为素因子
         */
        
        Miller_Rabin Mtest = new Miller_Rabin(); 
        BigInteger a = new BigInteger(d0);
        Mtest.MR(a);
        }
        
        

    }

}