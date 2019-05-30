import java.util.Scanner;

public class Distancebtwen2points {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st point (x1,y1) ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Entr 2nd point (x2,y2) ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double dis = Math.sqrt( (x2 - x1)^2 + (y2 - y1)^2 );
		System.out.println("Distance between 2 points are " + (int)dis);
	}
}
