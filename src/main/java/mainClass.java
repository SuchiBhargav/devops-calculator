import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mainClass {
    private static final Logger logger = LogManager.getLogger(mainClass.class);
    private static double inp;
    public  mainClass(){

    }
    public static void main(String args[]){



        logger.info("Square root function ");
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);

        inp=sc.nextDouble();
        if(inp<0){
            logger.error("Negative number");
        }
        logger.info("Square root of "+inp+":");
        sqrtFun sF=new sqrtFun();
        double res=sF.sqrt(inp);
        logger.info(res);
        System.out.println("Square root of "+inp+": "+res);

    }
}
