package demo;


import java.util.Scanner;

public class ncr{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter n");
    int n = in.nextInt();
 
    System.out.println("Enter r");
    int r = in.nextInt();
 
    int com =  factorial(n)/(factorial(n-r)*factorial(r));
 
    System.out.println("nCr: "+com);
 
  }
 
 
  private static int factorial(int num){
    if(num==0 || num==1)
      return 1;
 
    int fact = 1;
    for(int i=2; i<=num; i++){
      fact = fact*i;
    }
    return fact;
  }
}