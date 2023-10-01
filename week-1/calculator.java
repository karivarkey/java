import java.util.Scanner;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int i=0;
		do{
		
				
		    System.out.println("SIMPLE CALCULATOR \n\t\t ~Geevarghese Regi || U2203097\n");
			System.out.println("\n\nChoose your option number");
			int choice = 10;
			System.out.println("\n  1.Addition \n  2.Subtraction \n  3.Multplication \n  4.Division \n  0.Exit");
			choice = reader.nextInt();
			if(choice ==0){break;}
			System.out.println("\033[H\033[2J");
			System.out.print("Enter the first number : ");
			double n1 = reader.nextDouble();
			System.out.print("Enter the second number : ");
			double n2 = reader.nextDouble();
			System.out.println("\033[H\033[2J");
			if (choice==1)
			{	
				double answer = n1+n2;
				System.out.println("The SUM of " + n1 + " and " + n2 + " is " + answer );	
				System.out.println("ENTER ANY NUMBER TO GO TO MAIN MENU");
				int trash = reader.nextInt();
				System.out.println("\033[H\033[2J");
			}
			if (choice==2)
			{
				double answer = n1-n2;
				System.out.println("The SUBTRACTION of " + n1 + " and " + n2 + " is " + answer );	
				System.out.println("ENTER ANY NUMBER TO GO TO MAIN MENU");
				int trash = reader.nextInt();
				System.out.println("\033[H\033[2J");
			}
			if (choice==3)
			{
				double answer = n1*n2;
				System.out.println("The PRODUCT of " + n1 + " and " + n2 + " is " + answer );	
				System.out.println("ENTER ANY NUMBER TO GO TO MAIN MENU");
				int trash = reader.nextInt();
				System.out.println("\033[H\033[2J");
			}
			if (choice==4)
			{
				double answer = n1/n2;
				System.out.println("The QUOTIENT of " + n1 + " by " + n2 + " is " + answer );	
				System.out.println("ENTER ANY NUMBER TO GO TO MAIN MENU");
				int trash = reader.nextInt();
				System.out.println("\033[H\033[2J");
			}
			if (choice == 0)
			{
				 i=1;
				 break;
			}
		}
		while(i!=1);
		
        reader.close();
    }
    
}
