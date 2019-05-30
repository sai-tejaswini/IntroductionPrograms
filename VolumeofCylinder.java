import java.util.Scanner;

public class VolumeofCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cylinder");
		int r = sc.nextInt();
		System.out.println("Enter heigth of cyclinder");
		int h = sc.nextInt();
		int v = (22*r*r*h)/7;
		System.out.println("Voume of cylinder is " + v);
	}
}
