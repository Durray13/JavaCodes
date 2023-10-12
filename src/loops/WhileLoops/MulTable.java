package loops.WhileLoops;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int num=sc.nextInt();
		
		int pro=1;
		
		int i=1;
		
		while(i<=10) {
			pro=num*i;
			System.out.println(num+" x "+i+" = "+pro);
			pro=1;
			i++;
		}
		
	}

}
