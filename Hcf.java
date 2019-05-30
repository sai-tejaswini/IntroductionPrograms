import java.util.Scanner;

public class Hcf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp ;
		while (b > 0){
	   	     temp = b;
	   	     b = a % b; 
	   	     a = temp;
	   	}
		System.out.println("hcf=" + a);
	}
}
