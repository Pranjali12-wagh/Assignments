package demo;



import java.util.Scanner;
 public class PrimeNumber
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=scanner.nextInt();
		if(number==0||number==1)
		{	
			System.out.println(number+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+" is not a prime number");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println(number+" is a prime number");
		}
		}
	}
}