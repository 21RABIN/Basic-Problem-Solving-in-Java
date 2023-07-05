package Java_Basic_Array_Problems;

//import Scanner Class
import java.util.Scanner;

public class Even_and_Odd_Numbers_From_an_Array {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Declare A integer Variable
		int n, i;
		// Declare A Array Variable
		int a[] = new int[10];
		System.out.print("Enter The Number Of Array Elements : ");
		n = sc.nextInt();
		System.out.println("Enter The Elements : ");
		//Get The Elements
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		//Print the even numbers
		System.out.print("Even Number in Array : ");
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)

			{

				System.out.print(a[i] + " ");
			}
		}
		//even numbers printed nextLine
		System.out.println("");
		
		//Print odd numbers
		System.out.print("Odd Number in Array : ");

		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}

		// Enhanced For Loop
		/*
		 * System.out.print("Even Number in Array"); for(int value:a) { if(value%2==0) {
		 * System.out.print(value);
		 * 
		 * } } System.out.print("Odd Number in Array"); for(int value:a) {
		 * if(value%2!=0) { System.out.print(value);
		 * 
		 * } }
		 */
	}

}

/*
 * -------------------OUTPUT------------------------ 
 * Enter The Number Of Array Elements : 6 
 * Enter The Elements : 1 2 3 4 5 6 
 * Even Number in Array : 2 4 6
 * Odd Number in Array : 1 3 5
 * -------------------------------------------------
 * 
 * 
 */
