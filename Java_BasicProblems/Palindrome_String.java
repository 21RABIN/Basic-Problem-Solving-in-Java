package Java_BasicProblems;

//import a Scanner class File
import java.util.Scanner;

//Main Class
public class Palindrome_String {
 
	//Creating an object sc for Scanner Class
	static Scanner sc=new Scanner(System.in);
	//Main Method
	public static void main(String[] args) {
		 //Declare A String variable
		String str;
		String rev="";
		
		System.out.print("Enter the String : ");
		str=sc.nextLine();
		//String Reverse
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		String org_str=str;//--> *original String = input String
		//check condition original String == reverse String is equal print the statement
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" : is A Palindrome String");
		}
		//is Not equal print the statement
		else
		{
			System.out.println(org_str+" : is Not A Palindrome String");
		}
	}

}
/*
 * -----------OUTPUT-------------------
 * 1.Enter the String : RAMAR
 *   RAMAR : is A Palindrome String
 * 
 * 2.Enter the String : RABIN
 *   RABIN : is Not A Palindrome String
 *---------------------------------------
 */
