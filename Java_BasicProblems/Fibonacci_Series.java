package Java_BasicProblems;

//import Scanner Class 
import java.util.Scanner;

//Main Class
public class Fibonacci_Series {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {
		// Declare a Integer Variable
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print("Enter the Limit OF Fibonacci Series : ");
		// how many fibonnacci series number print
		int Lim = sc.nextInt();
		System.out.print("Fibonnacci Series : " + n1 + " " + n2 + " ");

		for (int i = 2; i < Lim; i++) {

			sum = n1 + n2; // add n1+n2
			System.out.print(sum + " ");
			n1 = n2; // swap tha values
			n2 = sum; // swap the values

		}

	}

}
/*----------------OUTPUT-------------------------
 * Enter the Limit OF Fibonacci Series : 10 
 * Fibonacci Series : 0 1 1 2 3 5 8 13 21 34
 * ----------------------------------------------
 */
