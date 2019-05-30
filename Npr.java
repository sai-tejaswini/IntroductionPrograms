import java.util.Scanner;

public class Npr {
	public static void main(String args[]) {
		Npr nn = new Npr();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of n and r");
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int npr = nn.Fact(n)/nn.Fact(n-r);
		System.out.println(npr);
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