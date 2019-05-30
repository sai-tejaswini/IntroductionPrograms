import java.util.Scanner;

public class AreaofRectangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of Rectangle ");
		int b = sc.nextInt();
		System.out.println("Enter height of Rectangle5 ");
		int h = sc.nextInt();

		int area = b*h;
		System.out.println("Area of Rectangle is " + area);
	}
}
