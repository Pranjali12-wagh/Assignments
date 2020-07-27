package demo;



import java.util.Scanner;
 public class SumOfDigits
{
	public static void main(String arg[])	
	{
	    int number,sum;
            Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter a number ");
                   number=scanner.nextInt();
	    for(sum=0 ;number!=0 ;number=number/10)
	    {
		sum=sum+(number%10);
	    }
	    System.out.println("Sum of digits of a number is "+sum);               	  
	}
}