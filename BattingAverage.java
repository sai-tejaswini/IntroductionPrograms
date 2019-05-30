import java.util.Scanner;

public class BattingAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matches ");
		int m = sc.nextInt();
		System.out.println("Enter total runs");
		int tr = sc.nextInt();
		System.out.println("Enter innings ");
		int in = sc.nextInt();
		System.out.println("Enter no.of notout ");
		int no = sc.nextInt();
		
		double avg = tr/(in - no);
		System.out.println("Batting average = " +avg);
	}
}
