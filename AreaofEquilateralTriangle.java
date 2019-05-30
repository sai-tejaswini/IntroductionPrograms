import java.util.Scanner;

public class AreaofEquilateralTriangle {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the length of equilateral triangle ");
		int s = sc.nextInt();
		double area = (Math.sqrt(3)/4)*(s*s);
		System.out.println("Area of equilateral triangle is " + area);
	}
}
