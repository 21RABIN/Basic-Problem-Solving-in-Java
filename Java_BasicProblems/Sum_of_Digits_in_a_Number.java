package Java_BasicProblems;
//import a Scanner Class
import java.util.Scanner;
//Main Class 
public class Sum_of_Digits_in_a_Number {

    //Creating a a Object sc for Scanner Class
	static Scanner sc=new Scanner(System.in);
	//Main Function
	public static void main(String[] args) {
		int num;
		System.out.print("Enter The Number : ");
		num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
		   int rem=num%10;//Remainder value
		   sum=sum+rem;  //add a Remainder value store a sum variable
		   num=num/10;   //This a quotient value then check loop condition 
		}
		//print sum value
		System.out.print("Sum of Digit Number : "+sum);

	}

}
/*
*Enter The Number : 123456789
*Sum of Digit Number : 45
*
*
*/