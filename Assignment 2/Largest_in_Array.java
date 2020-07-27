package demo;



import java.util.Scanner;



		

public class Largest_in_Array {
	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 67, 36, 2, 3, 345, 213, 4567 };
		int b[] = { 44, 66, 90, 77, 33, 20, 59, 97, 63, 28, 1998 };
		System.out.println("Largest: " + getLargest(a, 10));
		System.out.println("Largest: " + getLargest(b, 11));
	}
}
