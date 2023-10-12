package func;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a range: ");
		int start_range=sc.nextInt();
		int end_range=sc.nextInt();
		
		for(int l=start_range;l<=end_range;l++) {
			prime_num(l);
		}
		
	}
	public static void prime_num(int n) {
		int c=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println(n);
		}
	}

}
