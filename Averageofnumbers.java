import java.util.Scanner;

public class Averageofnumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements ");
		int a = sc.nextInt();
		int res = 0;
		for(int i=0; i<a ; i++) {
			res += sc.nextInt();
		}
		System.out.println("Average of given numbers is " + (res/a));
	}
}
