import java.util.Scanner;

public class VolumeofPrism {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of base triangle ");
		int b = sc.nextInt();
		System.out.println("Enter height of base triangle ");
		int h = sc.nextInt();

		int area = (b*h)/2;
		
		System.out.println("Enter height of cone ");
		int hc = sc.nextInt();
		
		float v  = area*hc;
		System.out.println("Volume of Prism is " + v);
	}
}
