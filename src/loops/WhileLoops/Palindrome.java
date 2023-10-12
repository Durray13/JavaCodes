package loops.WhileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int n1=n;
		int rev=0,ld;
		while(n>0) {
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		if(rev==n1)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
			
	}

}
