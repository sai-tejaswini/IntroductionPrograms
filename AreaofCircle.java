import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle ");
		int r = sc.nextInt();
		int area = (22*r*r)/7;
		System.out.println("Area of circle is " + area);
	}
}