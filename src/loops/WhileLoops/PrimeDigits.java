package loops.WhileLoops;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		while(n>0) {
			int ld=n%10;
			int i=1;
			int count=0;
			while(i<=ld) {
				if(ld%i==0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				System.out.println(ld);
			}
			n=n/10;
		}

	}

}
