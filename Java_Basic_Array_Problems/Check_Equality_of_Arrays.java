package Java_Basic_Array_Problems;

import java.util.Arrays;
//import Scanner Class
import java.util.Scanner;

//Main Class
public class Check_Equality_of_Arrays {

	// Creating a a Object sc for Scanner Class
		static Scanner sc = new Scanner(System.in);
		
		//Main Function
	public static void main(String[] args) {
		
		int i,n1,n2;
		int a1[]={10,20,30,40,50};
		int a2[]={10,20,30,40,50};
		
      // System.out.print("Enter The Number Of Elements Array 1 : ");
      // n1=sc.nextInt();
       //System.out.println("Enter The Array 1 Elements : ");
		//for(i=0;i<n1;i++)
	//	{
		//	a1[i]=sc.nextInt();
		//}
		 // System.out.print("Enter The Number Of Elements Array 2 : ");
	      // n2=sc.nextInt();
	      // System.out.println("Enter The Array 2 Elements : ");
		//	for(i=0;i<n2;i++)
			//{
			//	a2[i]=sc.nextInt();
		//	}     
			
			boolean a=Arrays.equals(a1,a2);
			System.out.println(a);
			boolean ststus=false;
			if(n1==n2)
			{
				for(i=0;i<a1.length;i++) {
					if(a1[i]==a2[i])
					{
						 ststus=true;
					}
					else
					{
				          ststus=false;
					}
					
				}
				if(ststus==true)
				{
				System.out.println("Equal");
				}
			}
			else
			{
				System.out.print("is Not Equal : ");
			}
	}

}
