package Java_BasicProblems;
import java.util.Scanner;

class Swap2Number
{
	int a,b,temp;
	Scanner sc=new Scanner(System.in);
	public void Swap()
	{
		System.out.println("Enter the Value A:");
		a=sc.nextInt(); 
		System.out.println("Enter the Value B:");
		b=sc.nextInt(); 
		System.out.println("Before Swap : "+"A="+a+",B="+b);
		// a=10,b=20
		temp=a;  //temp=10;
		a=b;     //a=20;
		b=temp;  //b=10;
		System.out.println("After Swap : "+"A="+a+",B="+b);
	}
}

//Main Class 
public class Swap_The_Number {
    //Main Function
	public static void main(String[] args) {
		
		//objecct create the Swap2Number Class
		Swap2Number s=new Swap2Number();
		//Call the Method
		s.Swap();
	}

}
/*
---------OUTPUT----------------
Enter the Value A:
10
Enter the Value B:
20
Before Swap : A=10,B=20
After Swap : A=20,B=10
--------------------------------
*/

/*
---Prblem Solve in Threee Methods----

* 1. Swap Two Number Using Temporary Variable
* before :a=10,b=20
* a=temp;  //a=10 temp=10
* a=b;     //a=20
* b=temp;  //b=10
* 
* After Swap:a=20,b=10
____________________________________________________

* 2.Swap Two Number Not Using Temporary Variable
*  a=10,b=20
*  a=a+b;   //a=10+20 -> a=30
*  b=a-b;   //b=30-20 -> b=10
*  a=a-b;   //a=30-10 -> a=20
* 
* AfterSwap:a=20,b=10

* 3.Swap Two Number Not Using Arthmetic Opration
*  It is a covert to XOR Oprator
*  a=10,b=20  a=10-->1010, b=20-->10100
*   a=a^b  //  10^20=30
*   b=a^b  //  30^20=10
*   a=a^b  //  30^10=20
*   
*  After Swap:a=20,b=10 
*/