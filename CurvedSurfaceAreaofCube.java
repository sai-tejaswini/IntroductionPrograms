import java.util.Scanner;

public class CurvedSurfaceAreaofCube {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a cube");
		int s = sc.nextInt();
		float a = 4*s*s;
		System.out.println("Cusrved Surface area of cube is " + a);
	}
}
