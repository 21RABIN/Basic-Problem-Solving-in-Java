package Java_BasicProblems;

//import Scanner Class
import java.util.Scanner;

//Main Class
public class Count_Number_of_Digits_in_a_Number {

	//Creating a a Object sc for Scanner Class
	static Scanner sc=new Scanner(System.in);
	
	//Main Function
	public static void main(String[] args) {
		int num;
		System.out.print("Enter The Number : ");
		num=sc.nextInt();
        int count=0;
        while(num>0)
        {
        	num=num/10;   //num=45678  45678/10=8,4567/10=7,456/10=6,45/10=5,4/10=0.4 0.4 is condition false
        	count++; //incresing the count
        }
        //print the count value
        System.out.print("Number Of Digit Count : "+count);
	}

}

/*
*--------------OUTPUT-------------------
*Enter The Number : 45678
*Number Of Digit Count : 5
*---------------------------------------
*/