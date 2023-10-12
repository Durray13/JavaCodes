package loops.WhileLoops;

import java.util.Scanner;

public class PowerWithLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pro = 1;
		System.out.println("Enter the base number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter the power: ");
		int p=sc.nextInt();
		int pwr=p;
		
		while(p>0) {
			pro=pro*b;
			p--;
		}
		System.out.println(b+" raised to the power of "+pwr+" is "+pro);
	}

}
