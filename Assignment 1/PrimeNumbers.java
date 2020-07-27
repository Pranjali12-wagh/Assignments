package demo;



 public class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       
       String  primeNumbers = "";

       for (i = 2; i <= 100; i++)         
       { 		  	  
          int c=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		c = c + 1;
	     }
	  }
	  if (c ==2)
	  {
	   
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 2 to 100 are :");
       System.out.println(primeNumbers);
   }
}