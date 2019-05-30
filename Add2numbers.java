import java.util.Scanner;

public class Add2numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to add ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of 2 numbers is " + (a+b));
	}
}
