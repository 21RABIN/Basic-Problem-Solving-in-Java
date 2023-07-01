package Java_BasicProblems;

import java.util.Scanner;
//Class
class ReveseNumber {
	// Declare A integer Variable n->Number,rev->revereNumber;
	int n, rev;
	Scanner sc = new Scanner(System.in);
//Method
	public void Reverse() {
		System.out.print("Enter the  Numbers : ");
		n = sc.nextInt();
		System.out.print("Reverse Number is :");
		//While loop
		while (n > 0) {
			rev = n % 10; // reverse=4720%10 reverse=0 | reverse=472%10 reverse=2 | reverse=47%10
							// reverse=7| reverse=4%10 reverse=0.4
			n = n / 10; // n=4720/10 n=472 | n=472/10 n=47 | n=47/10 n=4 | n=0
			System.out.print(rev);
		}
	}
}
//Main Class
public class Reverse_a_IntegerNumber {

	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReveseNumber r = new ReveseNumber();
		r.Reverse();
	}

}
/*---------------OUTPUT----------------------
 *  Enter the  Numbers : 4720
 *  Reverse Number is :0274
 * ------------------------------------------
 
 * ---------------------Explanation----------------------------------
 * n=4720
 * while(4720>0)  //Condition True is loop is running
 * {
 *    rev=4720 % 10   // 1.Remainder=0 Then reverseNumber=0  
 *    n=4720/10      // quotient=472 Then n=472        
 *    print(res)     // Finally Print 0
 *     While loop True is Repeate This Process
 *     While Loop false Stop The Processor
 * }
 *-------------------------------------------------------------------- 
 * ====================================================================
 *   1.SAMPLE INPUT OUPUT
 *     NUMBER=08235
 *     Reverse=5328  //ZERO NOT PRINT
 *   2.SAMBLE INPUT OUTPUT
 *     NUMBER=002583
 *     Reverse=38252 //Zero Not Print
 *=======================================================================    
 */   