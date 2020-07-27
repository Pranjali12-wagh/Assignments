package demo;

import java.util.Scanner;


public class CricketTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target runs : ");
		int targetRuns = scanner.nextInt();
		
		System.out.println("Enter current over : ");
		int currentOver = scanner.nextInt();
		
		System.out.println("Enter current score : ");
		int currentScore = scanner.nextInt();
		
		OneDayCricket object = new OneDayCricket(targetRuns);
		object.setCurrentOver(currentOver);
		object.setCurrentScore(currentScore);
		
		scanner.close();
		System.out.println("Current run rate : ");
		System.out.println(object.calcCurrentRunrate(currentScore, currentOver));
		System.out.println("Required run rate : ");
		System.out.println(object.calcReqdRunrate((targetRuns-currentScore), (object.getMaxOvers()-currentOver)));
	}
}