import java.util.Scanner;

public class Arithmetic_Demo {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n1,n2;
		int ans = 1, c = 0;
		char choice;
		
		do
		{
			System.out.println("a.Addition\tb. Substraction\nc. Multiplication\td. Division\te. Stop");
			System.out.println("Enter Your Choice : ");
			choice = s.next().charAt(0);
			switch(choice)
			{
				case 'a' :
					System.out.println("Enter The Numbers : ");
					n1 = s.nextInt();
					n2 = s.nextInt();
					c = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " + c);
					break;
					
				case 'b' :
					System.out.println("Enter The Numbers : ");
					n1 = s.nextInt();
					n2 = s.nextInt();
					if (n1>n2)
						c = n1 - n2;
					else
						c = n2 - n1;
					System.out.println(n1 + " - " + n2 + " = " + c);
					break;
					
				case 'c' :
					System.out.println("Enter The Numbers : ");
					n1 = s.nextInt();
					n2 = s.nextInt();
					c = n1 * n2;
					System.out.println(n1 + " * " + n2 + " = " + c);
					break;
					
				case 'd' :
					System.out.println("Enter The Numbers : ");
					n1 = s.nextInt();
					n2 = s.nextInt();
					c = n1 / n2;
					System.out.println(n1 + " / " + n2 + " = " + c);
					break;
				
				case 'e':
					System.exit(0);
					break;
					
				default:
					System.out.println("Inavlid Choice");
				
			}
			System.out.println("Do you Want to Continue\n1. Yes\t2. No ");
			ans = s.nextInt();
		}while(ans != 0);
		
	}

}
