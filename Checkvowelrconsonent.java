import java.util.Scanner;

public class Checkvowelrconsonent {
	public static void main(String args[]) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charecter ");
		String ch = sc.next();
		
		switch(ch){
		 case "a"  :
		 case "e"  :
		 case "i"  :
		 case "o"  :
		 case "u"  :
		 case "A"  :
		 case "E"  :
		 case "I"  :
		 case "O"  :
		 case "U"  :i++;
		}
		if(i==1)
			System.out.println("Entered character "+ch+" is  Vowel");
		else
			System.out.println("Entered character "+ch+" is  Consonent");
	}
}
