package loops.WhileLoops;

import java.util.Scanner;

public class FactorialWithUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int f=1;
		
		while(n>0) {
			f=f*n;
			n--;
		}
		System.out.println("Factorial: "+f);

	}

}
