import java.util.Scanner;

public class VolumeofSphere {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of sphere");
		int r = sc.nextInt();
		float area =  (4*22*r^3)/(3*7);
		System.out.println("Volume of sphere is " + area);
	}
}
