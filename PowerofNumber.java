import java.util.Scanner;

public class PowerofNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number and power of number ");
		int n = sc.nextInt();
		int p = sc.nextInt();
	//	double res = Math.pow(n,p);
		int res = n;
		for(int i=1; i<p; i++) {
			res *= n; 
		}
		System.out.println("Power of number is " + res);
	}
}
