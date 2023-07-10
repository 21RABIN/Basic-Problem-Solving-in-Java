package Java_Basic_Array_Problems;
//import Scanner Class
import java.util.Scanner;

//Main Class
public class Check_Equality_of_Arrays {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {

		//Declare A integer Variable
		int i,n1, n2;
		//Declare A Array Variable
		int a1[] = new int[10];
		int a2[] = new int[10];

		System.out.print("Enter The Number Of Elements Array 1 : ");
		n1 = sc.nextInt();
		System.out.println("Enter The Array 1 Elements : ");
		//Get a Array 1 Elements
		for (i = 0; i < n1; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.print("Enter The Number Of Elements Array 2 : ");
		n2 = sc.nextInt();
		System.out.println("Enter The Array 2 Elements : ");
		//Get A Array 2 Elements
		for (i = 0; i < n2; i++) {
			a2[i] = sc.nextInt();
		}
		System.out.println();
		int flag = 0;
		//Check A Array 1 length == Array 2 length | Condition True is Execute Following if Statement  
		if (n1 == n2) {
			for (i = 0; i < n1; i++) {
				//Array 1 Elements==Array 2 Elements
				if (a1[i] == a2[i]) {
					flag++;
				}
				
			}
			//flag == array 1 length
			if (flag == n1) {
				System.out.println("Two Arrays is Equal");
			} else {
				System.out.print("Two Array is Not equal ");
			}
		} else {
			System.out.print(" Two Arrays is Not Equal : ");
		}
	}

}

/*
-----------------------OUTPUT--------------------------------
* Enter The Number Of Elements Array 1 : 5
* Enter The Array 1 Elements : 
* 20
* 40
* 70
* 50
* 10
* Enter The Number Of Elements Array 2 : 5
* Enter The Array 2 Elements : 
* 20
* 40
* 70
* 50
* 10

* Two Arrays is Equal
* 
* ----------------------------------------------------------------
*/