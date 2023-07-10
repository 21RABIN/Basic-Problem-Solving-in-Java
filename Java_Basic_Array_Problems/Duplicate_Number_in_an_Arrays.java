package Java_Basic_Array_Problems;

//import SScanner Class
import java.util.Scanner;

//Main Class
public class Duplicate_Number_in_an_Arrays {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {
		int n;
		// Declare Array
		int a[] = new int[10];

		System.out.print("Enter The Number of Elements : ");
		n = sc.nextInt();

		System.out.println("Enter the Array Elements : ");
		// Get Array Elements
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("Duplicate Number is : ");
		// Check Duplicate Numbers
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
/*-------------------OUTPUT-----------------------------

* Enter The Number of Elements : 5
* Enter the Array Elements : 
* 20
* 40
* 20
* 50
* 40
* Duplicate Number is : 20 40

----------------------------------------------------------------
*/