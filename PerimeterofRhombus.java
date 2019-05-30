import java.util.Scanner;

public class PerimeterofRhombus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a Rhombus - ");
		int s = sc.nextInt();
		System.out.println("Perimeter of a Rhombus is - " + (4*s));
	}
}
