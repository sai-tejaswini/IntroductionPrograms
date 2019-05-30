import java.util.Scanner;
public class Commission {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount ");
		int a = sc.nextInt();
		System.out.println("Enter the commission percentage ");
		int c = sc.nextInt();
		int ca = (a * c )/100;
		System.out.println("\ncommission amount " + ca);
	}
}
