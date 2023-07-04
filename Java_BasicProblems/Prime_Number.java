package Java_BasicProblems;

//import Scanner Class
import java.util.Scanner;

//Main Class 
public class Prime_Number {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {
		// Declare A variable
		int num, count = 0;
		System.out.print("Enter the Number : ");
		num = sc.nextInt();
		// Check the condition number is grate then 1
		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) { // if The Condition n%i Remainder zero is count increment
					count++;
				}
			}
			if (count == 2) // count=2 print prime Number
			{
				System.out.print(num + " : is a Prime Number");
			}
			// count!=2 print not prime number
			else {
				System.out.print(num + " : Not a Prime Number");
			}
		}
		// Check the condition number is less then 1 print the following statement
		else {
			System.out.print(num + " : Not a Prime Number");
		}
	}
}

/*---------OUTPUT---------------
* 1.  Enter the Number : 3
*     3 : is a Prime Number
*     
* 2.   Enter the Number : 6
       6 : Not a Prime Number  
* -------------------------------
*/