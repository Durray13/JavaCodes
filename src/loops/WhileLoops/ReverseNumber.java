package loops.WhileLoops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rev=0,ld;
		while(n>0) {
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		System.out.println("Reverse Number: "+rev);
	}

}
