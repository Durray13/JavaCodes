package loops.WhileLoops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int s=0;
		int i=1;
		
		while(i<n) {
			if(n%i==0) {
				s=s+i;
			}
			i++;
		}
//		System.out.println(n);
		if(n==s) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}

	}

}
