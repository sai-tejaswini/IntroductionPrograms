import java.util.Scanner;

public class CompoundInterest {
	public static void main(String args[]){
 
//	double amount=0,principle=1000,rate=10,time=3,ci;			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle");
		int p = sc.nextInt();
		System.out.println("Enter the Rate");
		double r = sc.nextInt();
		System.out.println("Enter the Time");
		int t = sc.nextInt();
		r = (1+r)/100;
		r = Math.pow(r,t);
		System.out.println("r  = " + r);

		double a = p*r;
		double ci = a + p;
		System.out.println("amount = " + ci);

		System.out.println("Compound interest = " + a );
	}
}