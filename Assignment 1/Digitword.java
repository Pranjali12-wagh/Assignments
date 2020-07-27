package demo;


import java.util.Scanner;
public class Digitword
{
static String[] words= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your Number");
	int digit =sc.nextInt();
	System.out.println("you entered "+ words[digit]);
	sc.close();
}
}