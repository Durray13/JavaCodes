package loops.WhileLoops;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int n1=n;
		int n2=n;
		int c=0;
		int s=0;
		while(n1>0) {
			int ld=n1%10;
			c++;
			n1=n1/10;
		}
		while(n2>0) {
			int ld=n2%10;
//			int p=(int)Math.pow(ld,c);
			s=s+(int)Math.pow(ld,c);
			n2=n2/10;
		}
		if(n==s) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not a Armstrong Number");
		}

	}

}
