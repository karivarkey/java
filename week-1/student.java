import java.util.Scanner;

public class student
{
	public static void main(String[] args)
	{
        System.out.println("STUDENT MARK GRADER \n\t\t ~Geevarghese Regi || U2203097\n");
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter student marks : ");
		int marks = reader.nextInt();
		
		if (marks >= 90 && marks <= 100)
		{
			System.out.println("The marks is " + marks + " and grade is A");	
		}
		else if (marks >= 80 && marks <90)
		{
			System.out.println("The marks is " + marks + " and grade is B");	
		}
		else if (marks >= 70 && marks <80)
		{
			System.out.println("The marks is " + marks + " and grade is C");	
		}
		else if (marks >= 60 && marks <70)
		{
			System.out.println("The marks is " + marks + " and grade is D");	
		}
		else if (marks <60 && marks >=0) 
		{
			System.out.println("The marks is " + marks + " and grade is F");	
		}
		else
		{
			System.out.println("ENTER VALID MARKS!!");	
		}
        reader.close();
	}
}