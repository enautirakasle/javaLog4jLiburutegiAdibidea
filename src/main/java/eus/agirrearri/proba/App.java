package eus.agirrearri.proba;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
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
        }
        
    }
}
