import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of terms in series ");
		int n = sc.nextInt();
		int i=0,j=1,x=0;
		for(int k=0 ; k<n; k++){
			System.out.print(i + " ");
			x = i+j ;
			i = j;
			j = x;
		}
	}
}
