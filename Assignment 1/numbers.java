package demo;



	import java.util.Scanner;
	public class numbers 
	{ 
	    
	    static void printNos(int n) 
	    { 
	        if(n > 9) 
	        { 
	            printNos(n - 1); 
	            System.out.print(n + " "); 
	        } 
	        return; 
	    } 
	  
	    
	    public static void main(String[] args)  
	    { 
	        printNos(100); 
	    } 
	} 
	  

	
	     
	
