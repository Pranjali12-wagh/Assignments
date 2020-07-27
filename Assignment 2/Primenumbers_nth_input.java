package demo;




import java.util.Scanner;
public interface Primenumbers_nth_input {
	 public static void main (String[] args)
	   {		
	      Scanner sc = new Scanner(System.in);
	      int i =0;
	      int num =0;	      
	      String  primeNumbers = "";
	      System.out.println("Enter n value:");
	      int nth = sc.nextInt();
	      sc.close();
	      for (i = 1; i <= nth; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	   }

}
