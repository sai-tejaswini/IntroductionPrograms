import java.util.Scanner;

public class DiscountPrice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter market price ");
		int mp = sc.nextInt();
		System.out.println("Enter discount ");
		int d = sc.nextInt();
		int dp = (mp*d)/100;
		int sp = mp - dp;
		System.out.println("Price after discount is " + sp);
	}
}
