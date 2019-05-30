import java.util.Scanner;

public class PerimeterofEquilateralTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of equilateral triangle");
		int a = sc.nextInt();
		System.out.println("Perimeter of equilateral triangle is " + (a+a+a));
	}
}
