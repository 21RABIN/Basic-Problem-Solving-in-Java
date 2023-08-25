import java.util.*;
class loginn
 {
	 private String usrname="rabinma@gmail.com";
	private String Password="rabin123";
	 String name,city,phone;
	 int age;
	 
	 
	 void login(String usrname,String Password)
	 {
		 usrname=this.usrname;
		 Password=this.Password;
		
		 Scanner o=new Scanner(System.in);
		 
		 if(usrname==this.usrname && Password.equals(Password))
		 {
			System.out.println("LOGIN SUCESS"); 
		 }
		 else 
		 {
			 System.out.println("!!!!!!Sorry your password or usrname any one dosint macth!!!!!");
		 }
		 o.close();
	 }
	 void create() {
		 Scanner o=new Scanner(System.in);
		 System.out.println("Enter your name");
		 name=o.nextLine();
		 System.out.println("Enter your age");
		 age=o.nextInt();
		 System.out.println("Enter your city");
		 city=o.next();
		 System.out.println("Enter your phonenumber");
		 phone=o.next();
		 if(age<18)
		 {
			 System.out.println("!!!!!!!AGE IS UNDER 18+ CREATE THE ACCOUNT!!!!!!! ");
		 }
		 else {
			 System.out.println("NAME:"+name);
			 System.out.println("AGE:"+age);
			 System.out.println("CITY:"+city);
			 System.out.println("Phonenumber:"+phone);
			 System.out.println("..........YES YOUR ACCCOUNT CREATADE Sucsess..............");
		 }
		 o.close();
	 }
 }


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		loginn s=new loginn();
		System.out.println("1.login account\n2.create account");
		int ch=o.nextInt();
		if(ch==1)
		{
			Scanner oo=new Scanner(System.in);
			 System.out.println("Enter the username");
			String usrname=oo.nextLine();
			System.out.println("Enter the your password");
			String Password=oo.nextLine();
			
			
	    	s.login(usrname,Password);
			oo.close();
		}
		
		else if(ch==2)
		{
			s.create();
		}
		
o.close();
	}

}
