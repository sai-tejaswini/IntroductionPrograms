import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int y = num;
		int x,a=0;
		while(num!=0){
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		//System.out.println(a);
		if(a == y) 
			System.out.println("Armstrong number");
		else 
			System.out.println("Not an Armstrong number");
	}
}
