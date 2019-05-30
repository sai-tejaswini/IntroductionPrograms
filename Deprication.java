import java.util.Scanner;

public class Deprication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount ");
		int a = sc.nextInt();
		System.out.println("Enter the deprication ");
		int d = sc.nextInt();
		System.out.println("Enter the no.of years ");
		int y = sc.nextInt();
		int temp = a;
		for(int i=0; i<y ;i++) {
			temp = ( (100 - d)*temp )/100;
		}
		System.out.println("Amount after deprication " +temp);
	}
}
