import java.util.Scanner;

public class AreaofParellelogram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of Parellelogram ");
		int b = sc.nextInt();
		System.out.println("Enter height of Parellelogram ");
		int h = sc.nextInt();

		int area = b*h;
		System.out.println("Area of Parellelogram is " + area);
	}
}
