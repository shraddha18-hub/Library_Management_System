package Library;
import java.util.Scanner;
public class Studentpage {
int[] rollno;
String[] name;
int n=0;
int ch;
Scanner sc = new Scanner(System.in);
	public void Student_page()
	{
		do {
			
		    System.out.println("***Student Page***");
			System.out.println("1.Add Students");
			System.out.println("2.Display all Students");
			System.out.println("3.Exit");
			
			System.out.println("Enter the choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				AddStudent();
				break;
			case 2:
				DisplayStudent();
				break;
			case 3:
				break;
			}
		}while(ch!=3);
	}
	
	public void AddStudent()
	{
		//int n;
		System.out.println("Enter how many students you want to add");
		n = sc.nextInt();
		rollno = new int[n];
		name = new String[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Student Roll Number:");
		rollno[i]= sc.nextInt();
		
		System.out.println("Enter Student Name:");
		name[i]= sc.next();
	   }
		System.out.println("Data Saved Successfully!");
	}	
	
	public void DisplayStudent()
	{
		if(n==0)
			System.out.println("No Student Info is there !!!!");
		else {
			 System.out.println("List of Students and Roll no : ");
			for(int i=0;i<n;i++) {
				
					System.out.println(rollno[i]+" -> "+name[i]);
				}
		}
		
	}

	


}
