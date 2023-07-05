package Java_BasicProblems;

//import Scanner Class
import java.util.Scanner;

//Main Class
public class Factorial_of_a_Number {

	// Creating a a Object sc for Scanner Class
	static Scanner sc = new Scanner(System.in);
	
	//Main Function
	public static void main(String[] args) {
		//Declare A variable
		int num,Fact=1;
		
		System.out.print("Enter the Number : ");
          num=sc.nextInt(); 
          
          
        for(int i=1;i<=num;i++)
        {
             Fact=Fact*i;
        }
        System.out.print("Factorial : "+Fact);
	}

}
/*--------OUTPUT-----------------
* Enter the Number : 5
* Factorial : 120
* -------------------------------		
		*/