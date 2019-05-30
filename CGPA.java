import java.util.Scanner;

public class CGPA {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subjects marks");
		int m[] = new int[5];
		int g[] = new int[5];
		float sum = 0 ;
		for(int i=0; i<5 ;i++) {
			m[i] = sc.nextInt();
			g[i] = m[i]/10;
			sum += g[i];
		}
		sum = sum/5;
		System.out.println("CGPA : " +sum);
	}
}
