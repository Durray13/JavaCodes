package loops.WhileLoops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int count=0;
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Composite Number");
		}

	}

}
