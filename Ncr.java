import java.util.Scanner;

public class Ncr {
	public static void main(String args[]) {
		Ncr nn = new Ncr();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of n and r");
		int n = sc.nextInt();
		int r = sc.nextInt();

		int ncr = nn.npr(n,r)/nn.Fact(r);
		System.out.println("\n" + ncr);
	}
	int npr(int n ,int r) {
		int npr = Fact(n)/Fact(n-r);
		return npr;
	}
	int Fact(int n) {
		int res = 1;
		while(n!=1) {
			res *= n;
			n--;
		}
		return res;
	}
}
