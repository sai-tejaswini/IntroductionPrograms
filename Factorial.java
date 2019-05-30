import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to do factorial ");
		int n = sc.nextInt();
		int res = 1;
		while(n!=1) {
			res *= n;
			n--;
		}
		System.out.println(res);
	}
}
