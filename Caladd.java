import java.util.Scanner.*;
public class Caladd
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice,ch;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.print("\n-----------------\n");
			System.out.print("1. Add two numbers:\n");
			System.out.print("2. Subtract two numbers:\n");
			System.out.print("3.Exit\n")
			choice =scan.next().charAt(0);
			switch(choice)
			{
				case '1': System.out.print("Enter two numbers:\n ")
					  a=scan.nextFloat();
					  b=scan.nextFloat();
			 	 	  res = a+b;
					  System.out.println("Result = "res\n);
					  break;
				case '2': System.out.print("Enter two numbers:\n ")
					  a=scan.nextFloat();
					  b=scan.nextFloat();
			 	 	  res = a-b;
					  System.out.println("Result = "res\n);
					  break;
				case '3': System.exit(0);
					  break;	
				default : System.out.println("Invalid Choice!");
					  break;
			}
			System.out.print("\n-----------------\n");
		}while(choice !=2);
	}
}
