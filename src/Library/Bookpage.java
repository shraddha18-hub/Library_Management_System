package Library;
import java.util.Scanner;
public class Bookpage {
	int ch;
	int n=0;
	String[] name;
	Scanner sc = new Scanner(System.in);
	public void Book_page() {
		do {
			System.out.println("***Book Page***");
			System.out.println("1.Add Book");
			System.out.println("2.Display Book");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				  AddBook();
			      break;
			case 2:
				  DisplayBook();
				  break;
			case 3:
				  break;
			}
			
		}while(ch!=3);
	}
	
	void AddBook()
	{
		System.out.println("Enter how many Books you want to add");
		n = sc.nextInt();
		name = new String[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Book Name:");
		name[i]= sc.next();
	   }
		System.out.println("BOOK ADDED SUCCESSFULLY!");
		
	}
	void DisplayBook()
	{
		if(n==0)
			System.out.println("No Book Info is there !!!!");
		else {
			 System.out.println("Available Books are: ");
			for(int i=0;i<n;i++) {
				
					System.out.println(name[i]);
				}
		}
	}

	}

