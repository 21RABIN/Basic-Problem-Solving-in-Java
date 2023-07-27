package Java_BasicProblems;

//import Scanner Class 
import java.util.Scanner;

//Main Class
public class Remove_White_Space_In_a_String {

	// Creating  a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Default String
		String Str1 = "HI GUYS I AM RABIN";
		System.out.println("Before Default String Not Removing White Space : " + Str1);
		System.out.print("After Removing White Space Strings : ");
		// Removing White Space Using Replace Method
		System.out.println(Str1.replaceAll("\\s", ""));
		System.out.println("-------------------------------------------------------------");
		// User Enter The String
		System.out.print("Enter The String : ");
		String Str2 = sc.nextLine();
		System.out.println("Before String Not Removing white Space : " + Str2);

		System.out.print("After Removing White Space Strings : ");
		// Removing White Space Using Replace Method
		System.out.println(Str2.replaceAll("\\s", ""));

	}

}

/*
* ------------------------OUTPUT-------------------------------------
* 
* Before Default String Not Removing White Space : HI GUYS I AM RABIN
* After Removing White Space Strings : HIGUYSIAMRABIN
* --------------------------------------------------------------------
* Enter The String : HOW ARE YOU
* Before String Not Removing white Space : HOW ARE YOU
* After Removing White Space Strings : HOWAREYOU
*/