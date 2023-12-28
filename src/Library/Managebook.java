package Library;
import java.util.Scanner;
public class Managebook {
    int roll;
    String name;
	int ch;
	Scanner sc = new Scanner(System.in);
	public void Manage_book() {
		do {
			
		System.out.println("***Manage Book Page***");
		System.out.println("1.Issue Book");
		System.out.println("2.Return Book");
		System.out.println("3.Exit");
		System.out.println("Enter the choice: ");
		
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			IssueBook();
			break;
		case 2:
			ReturnBook();
			break;
		case 3:
			break;
			
		}
		}while(ch!=3);
		
	}
	
	void IssueBook()
	{
		System.out.println("Issue Book to Student");
		System.out.println("Enter Student Roll Number: ");
		roll = sc.nextInt();
		System.out.println("Enter Book Name");
		name = sc.next();
	}
	void ReturnBook()
	{
		
		System.out.println("Enter Student Roll Number: ");
		roll = sc.nextInt();
		System.out.println("Enter Book Name");
		name = sc.next();
		System.out.println(name + " Book is Submitted by roll number " + roll);
	}

}
