import java.util.Scanner;

public class SumofNnumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int res =0;
		for(int i=1 ; i<=n ; i++) {
			res += i;
		}
		System.out.println("Sum of " + n + " numbers " + res);
	}
}
