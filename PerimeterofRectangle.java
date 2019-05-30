import java.util.Scanner;

public class PerimeterofRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of a Rectangle - ");
		int b = sc.nextInt();
		System.out.println("Enter height of a Rectangle - ");
		int h = sc.nextInt();
		System.out.println("Perimeter of a Rectangle is - " + (b+h));
	}
}
