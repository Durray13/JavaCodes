package loops.ForLoops;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
		for(int n=11;n<=20;n++) {
			int c=0;
			
			for(int i=2; i<n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(n);
			}	
		}
		
	}

}
