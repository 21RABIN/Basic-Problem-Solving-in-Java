package Java_Basic_Array_Problems;

//import Scanner Class
import java.util.Scanner;

//Main Class
public class Sum_of_Elements_in_Array {

	// Creating a a Object sc for Scanner Class
		static Scanner sc = new Scanner(System.in);
	
	//Main Function
	public static void main(String[] args) {
		//Declare a Variable
		int n,i,sum=0;
		//Declare Array a Array Variable
		int a[]=new int[10];
		System.out.print("Enter the Number OF Elements : ");
		n=sc.nextInt();
		System.out.println("Enter the Elements : ");
		//Get The Elements
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		//Sum OF The Elements 
		for(i=0;i<n;i++)
		{
		    sum=sum+a[i];
		}
		System.out.print("Sum of Array Element is : "+sum);
	
	}

}
/*
*----------------OUTPUT---------------------- 
* Enter the Number OF Elements : 5
* Enter the Elements : 
* 10
* 20
* 30
* 40
* 50
* Sum of Array Element is : 150
 *-----------------------------------------
 */