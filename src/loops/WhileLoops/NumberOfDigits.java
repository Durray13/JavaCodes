package loops.WhileLoops;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int c=0;
		while(n>0) {
			int ld=n%10;
			c++;
			n=n/10;
		}
		System.out.println("No of Digits: "+c);

	}

}
