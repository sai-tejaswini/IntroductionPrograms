import java.util.Scanner;

public class PerimeterofCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle ");
		int r = sc.nextInt();
		float perimeter = (2*r*22)/7;
		System.out.println("Perimeter of circle  is " + perimeter);
	}
}
