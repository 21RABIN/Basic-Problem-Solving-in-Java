package Java_BasicProblems;

//import Scanner Class
import java.util.Scanner;
//import Random Class
import java.util.Random;
//import appache commans lang
import org.apache.commons.lang3.RandomStringUtils;

//Main CLass
public class Generate_Random_Number_and_String {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {

		// Calling A Random Class
		Random rand = new Random();
		// integer Random Number
		int integer = rand.nextInt(100);
		// Double Random Number
		double doubl = rand.nextDouble();
		System.out.println("Random Integer Number : " + integer);
		System.out.println("Random Double Number : " + doubl);
        
		// Math Function Random Number
		System.out.println("Math Function Random Number : " + Math.random());
		
// add a class apachi 		
		/*go to the web 
		 * copy the link and past the following url downlod the zip file then extract 
		 * Download URL--> https://dlcdn.apache.org//commons/lang/binaries/commons-lang3-3.12.0-bin.zip
		 * 
		 * Then add a your project Library File
		 * 
		 */
		//Random Numeric Number
		String ran_num=RandomStringUtils.randomNumeric(5);
        System.out.println("Random Numeric Number : "+ran_num);
        //Random Alphabetic Letter
		String ran_str=RandomStringUtils.randomAlphabetic(5);
        System.out.print("Random String Letters : "+ran_str);
		
		
		
	}

}

/*------------OUTPUT----------------------------------
 *  Random Integer Number : 85
 *  Random Double Number : 0.4846655229007658
 *  Math Function Random Number : 0.009334478662955115
 *  Random Numeric Number : 09228
 *  Random String Letters : cDluB
 * ----------------------------------------------------
 */
