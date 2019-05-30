import java.util.Scanner;

public class VolumeofCone {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cone");
		int r = sc.nextInt();
		System.out.println("Enter height of a cone");
		int h = sc.nextInt();
		float v = (22*r*r*h)/(3*7);
		System.out.println("Volume of a cone " + v );
	}
}
