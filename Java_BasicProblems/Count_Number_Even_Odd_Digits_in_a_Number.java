package Java_BasicProblems;
//import a Scanner Class
import java.util.Scanner;
//Main Class
public class Count_Number_Even_Odd_Digits_in_a_Number {
 
      //Creating a a Object sc for Scanner Class
		static Scanner sc=new Scanner(System.in);
	
	//Main Function
	public static void main(String[] args) {
		
		int num;
		System.out.print("Enter The Number : ");
		num=sc.nextInt();
		int Even=0;
		int Odd=0;
		while(num>0)
		{
			int rem=num%10;  //Remainder value
			if(rem%2==0)   //Remainder%2==0 increment Even++
			{
		        Even++;
			}
			else     //Remainder Not equal 0 Then odd increment 
			{
				Odd++;
			}
			num=num/10;  //This a quotient value then check loop condition 
		}
		//print the even count
		System.out.println("Number of Digit Even Count : "+Even);
		//print the odd count
		System.out.print("Number of Digit Odd Count : "+Odd);

	}

}
/*
 *------------OUTPUT---------------------- 
  *Enter The Number : 36728
  *Number of Digit Even Count : 3
  *Number of Digit Odd Count : 2
 *---------------------------------------
*/