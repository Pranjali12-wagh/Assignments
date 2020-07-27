package demo;
import java.util.Scanner;



public class Num_series {
	public static void main(String[] args) {
		int d, i, n;
		System.out.println("No.of terms in Series:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {

			d = i * i * i;
			System.out.println(d + " \t");
		}
	}
}
	
