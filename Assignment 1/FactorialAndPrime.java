package demo;



import java.util.Scanner;
 public class FactorialAndPrime
{  
	public static void main(String args[])
	{  
		int factorial=1,flag=0;  
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to calculate factorial: ");
		int number=scanner.nextInt();   
		for(int i=number;i>=1;i--)
		{    
      			factorial=factorial*i;    
  		}    
		System.out.println("Factorial of a "+number+" is : "+factorial);
		if(factorial==0||factorial==1)
		{	
			System.out.println("Factorial "+factorial+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=factorial/2;i++)
			{
				if(factorial%i==0)
				{
					System.out.println("Factorial "+factorial+" is not a prime number");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println("Factorial "+factorial+" is a prime number");
		}
		}    
	}  
} 