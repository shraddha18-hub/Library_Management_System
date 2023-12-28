package Library;
import java.util.Scanner;
public class User {

	String id = " ";
	String password = " ";
	int ch;
	Scanner sc = new Scanner(System.in);
	public void show()
	{
		do {
		System.out.println("***LIBRARY MANAGEMENT SYSTEM***");
		System.out.println("1.Login \n");
		System.out.println("2.Signup \n");
		System.out.println("3.Exit \n");
		System.out.println("Enter the choice");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			  Login();
			  break;
		case 2: 
			  Signup();
			  break;
		case 3:
			  break;
		}
		
		}while(ch!=3);
		
	}
	
	void Login()
	{
		if(id=="" && password =="")
		{
			System.out.println("First Signup Please!");
			return;
		}
		System.out.println("Enter the Id");
		String new_id = sc.next();
		System.out.println("Enter the Password");
		String pass = sc.next();
		admin ad = new admin();
		if(id.equals(new_id) && password.equals(pass))
		{
			System.out.println("Login Successfull! WELCOME ADMIN");
			ad.adminpage();
		}
		else
		{
			System.out.println("You have entered Wrong Id or Password! LOGIN UNSUCCESSFULL! ");
		}
		
	}
	void Signup()
	{
		System.out.println("Enter the Id");
		id = sc.next();
		System.out.println("Enter the Password");
		password = sc.next();
		System.out.println("SIGNUP SUCCESSFULL!");
		
	}
	public static void main(String args[])
	{
		User u = new User();
		u.show();
	}
	
}
