package Java_BasicProblems;

//import a Scanner Class File
import java.util.Scanner;
//Main Class
public class Palindrome_Number {

	//Creating an object sc for Scanner Class
	static Scanner sc=new Scanner(System.in);
	// Main Function
	public static void main(String[] args) {
		int n;
		//Creating an object sc for Scanner Class
	
		System.out.print("Enter the Number : ");
		n=sc.nextInt();
	int rev=0;
	int org_num=n;
	//Reverse a Number
		while(n>0)
		{
		    rev=rev*10 +n%10;
		    n=n/10;
		}
		//check condition original number == reverse number is equal print the statement
		 if(org_num==rev)
		 {
			 System.out.println(org_num+" : is a Palindrome");
		 }
		 //is not equal print the statement
		 else
		 {
			 System.out.println(org_num+" : is a Not a Palindrome");
		 }
	}

}

/*
-----------OUTPUT--------------
1.Enter the Number : 465
465 : is a Not a Palindrome

2.Enter the Number : 121
121 : is a Palindrome
*/