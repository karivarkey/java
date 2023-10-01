import java.util.Scanner;

public class reverse
{
	public static void main(String[] args)
	{
		System.out.println("NUMBER REVERSE\n\t\t ~Geevarghese Regi || U2203097\n");
        Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number to reverse :  ");
		int number = reader.nextInt();
		int i = 0,digit,reversed_number=0;
		int number_copy=number;
		for(i=0;number>0;i++)
		{
			digit = number%10;
			reversed_number = reversed_number*10 + digit;
			number = number/10;
		}
		System.out.println("The reverse of "+ number_copy+" is "+reversed_number);
        reader.close();
    }
}