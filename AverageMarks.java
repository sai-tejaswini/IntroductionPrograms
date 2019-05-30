import java.util.Scanner;

public class AverageMarks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subjects marks ");
		int m[] = new int[5];
		int res = 0;
		for(int i=0; i<5; i++) {
			m[i] = sc.nextInt();
			res += m[i];
		}
		res = res/5;
		System.out.println("Average = " + res);
		
	}
}