import java.util.Scanner;

public class Lcm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(a>b) {
			c = a;
		}
		else
			c =b;
		int temp = c;
		int i = 2;
		while(c%a != 0 || c%b != 0) {
			c = temp*i;
			i++;
		}
		System.out.println("LCM of two numbers is " + c);
	}
}