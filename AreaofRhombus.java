import java.util.Scanner;

public class AreaofRhombus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of diagonal1 ");
		int d1 = sc.nextInt();
		System.out.println("Enter length of diagonal2 ");
		int d2 = sc.nextInt();
		
		int area = (d1*d2)/2;
		System.out.println("Area of Rhombus is " + area);
	}
}
