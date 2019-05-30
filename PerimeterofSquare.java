import java.util.Scanner;

public class PerimeterofSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a Square - ");
		int s = sc.nextInt();
		System.out.println("Perimeter of a Square is - " + (4*s));
	}
}
