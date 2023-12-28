package Library;
import java.util.Scanner;
public class admin {
Scanner sc = new Scanner(System.in);
int ch;
Studentpage s = new Studentpage();
Bookpage b = new Bookpage();
Managebook m = new Managebook();
	void adminpage()
	{
		do{
			System.out.println("***Admin Page***");
			System.out.println("1.Student Records");
			System.out.println("2.Book Records");
			System.out.println("3.Manage Books");
			System.out.println("4.Exit");
			
			System.out.println("Enter the choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				   s.Student_page();
				   break;
			case 2:
				   b.Book_page();
				   break;
			case 3:
				   m.Manage_book();
				   break;
			case 4: 
				   break;
			}
	}while(ch!=4);
		
}
}
