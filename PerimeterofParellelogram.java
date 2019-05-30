import java.util.Scanner;

public class PerimeterofParellelogram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of a Parellelogram - ");
		int b = sc.nextInt();
		System.out.println("Enter height of a Parellelogram - ");
		int h = sc.nextInt();
		System.out.println("Perimeter of a Parellelogram is - " + (b+h));
	}
}
