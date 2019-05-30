import java.util.Scanner;

public class Areaofisosceles {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of triangle ");
		int b = sc.nextInt();
		System.out.println("Enter height of triangle ");
		int h = sc.nextInt();

		double area = (b/4)*Math.sqrt((4*b*b)-(h*h)) ;
		System.out.println("Area of triangle is " + area);
	}
}
