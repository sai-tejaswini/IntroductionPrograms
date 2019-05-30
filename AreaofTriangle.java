import java.util.Scanner;

public class AreaofTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of triangle ");
		int b = sc.nextInt();
		System.out.println("Enter height of triangle ");
		int h = sc.nextInt();

		int area = (b*h)/2;
		System.out.println("Area of triangle is " + area);
	}
}
