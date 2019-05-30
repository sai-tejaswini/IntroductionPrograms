import java.util.Scanner;

public class TotalSurfaceAreaofCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a Cylinder ");
		int r = sc.nextInt();
		System.out.println("Enter height of a Cylinder");
		int h = sc.nextInt();
		float area = ((2*22*r)*(r+h))/7;
		System.out.println("Total surface area of Cylinder is " + area);
	}
}
