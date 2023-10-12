package loops.WhileLoops;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int n1=n;
		int s=0;
		while(n>0) {
			int ld=n%10;
			
			int f=1;
			int i=1;
			while(i<=ld) {
				f=f*i;
				i++;
			}
			s=s+f;
			
			n=n/10;
		}
		if(n1==s) {
			System.out.println(n1+ " is a Special Number/KrishnaMurthy Number");
		}
		else {
			System.out.println(n1+" is not a Special Number/KrishnaMurthy Number");
		}

	}

}
