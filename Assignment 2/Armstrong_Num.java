package demo;
import java.util.Scanner;







public class Armstrong_Num {
	public static void main(String[] args) {
		int c = 0, a, n, temp;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("This is a armstrong number");
		else
			System.out.println("This is not armstrong number!!");
	}

}
	
