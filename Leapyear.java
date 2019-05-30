import java.util.Scanner;

public class Leapyear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		int yr = sc.nextInt();
		
		int a=0,c=0;
		
		if(yr != 0) {
			a = (yr % 400 == 0) ? 1 : ((yr % 100 == 0) ? 0 : (yr % 4 == 0) ? 1 : 0 	 ) ;
			if(a==1) {
				System.out.println("leap year");
			}
			else
				System.out.println("Not a leap year");
		}
		else
			System.out.println("year not exist");
	}
}
