package eus.agirrearri.proba;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	 
        System.out.println( "Idatzi zenbakia" );
        Scanner scan = new Scanner(System.in);
        try {
        	int num = Integer.parseInt(scan.nextLine());
        	System.out.println(num);        	
        }catch(Exception e) {
        	System.out.println("No puedo pasar a numero");
//        	e.printStackTrace();
            logger.error("Didn't do it.", e);
//            logger.trace("Exiting application.");

        }
    }
}
