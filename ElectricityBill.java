import java.util.Scanner;

public class ElectricityBill {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many wats used ");
		int w = sc.nextInt();
		System.out.println("Enter no.of days");
		int d = sc.nextInt();
		int totalKw = w*24*d;
		float consumedunits = totalKw / 1000;
		System.out.println("Enter cost per unit ");
		int c = sc.nextInt();
		double bill = c*consumedunits;
		System.out.println("Electricity bill : " + bill);
	}
}
