package Java_BasicProblems;

//import a class files
import java.util.Scanner;

//Main Class
public class Reverse_a_String {
	//Creating an object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);
	// Main Method
	public static void main(String[] args) {
    // declare a String Variable
		String str;
		String rev_str = "";	
		System.out.print("Enter the String : ");
		str = sc.nextLine();
// ---------------1.1String Reverse Using Concatenate----------------
				for (int i = str.length() - 1; i >= 0; i--) // i=length-1 5-1=4;4>=0|4-1=3;3>=0|3-1=2;2>=0|2-1=1;1>=0|1-0=0
															// 0<=0|0-1=-1;-1>=0 FALSE EXITLOOP
				{
					rev_str = rev_str + str.charAt(i); // INDEX:4->N,3->I,2->B,1-> A ,0->R
				}
				System.out.println("Reverse String is : " + rev_str);
			}
		}

	
/*
----------------------2.String Reverse Using CharacterArray----------------- 
		 * char a[]=str.toCharArray(); 
		 * int length=a.length; 
		 * for(int i=length-1;i>=0;i--) 
		 * {
		 * rev_str+=a[i]; } System.out.println("Reverse String is : "+rev_str);
		 * }
____________________________________________________________________________
		
/*
		 *   -------------3.Easy Method To StringBuffer Class------------------
		 * StringBuffer B=new StringBuffer(str);
		 * System.out.println("Reverse String is : "+B.reverse());
*/
	
/*-----------------OUTPUT--------------------
 * Enter the String : RABIN
 * Reverse String is : NIBAR
 * ------------------------------------------
 * 
 * ==========EXPLANATION=====================
 * index    01234
 *          ^^^^^ 
 *          |||||
 * STRING = RABIN---->length=5  
 *  str.length()-1 ---->5-1 = 4 loop starting From 4th index i--  4-1 3 next loop starting from 3
 *  
 *  
*/
