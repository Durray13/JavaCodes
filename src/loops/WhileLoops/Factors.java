package loops.WhileLoops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int i=1;
		int c=0;
		while(i<=n) {
			if(n%i==0) {
//				System.out.println(i);
				c++;
			}
			i++;
		}
//		System.out.println("Number of factors: "+c);

		if(c==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
