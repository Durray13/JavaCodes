package loops.WhileLoops;

import java.util.Scanner;

public class Div2And3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting range:");
		int sp=sc.nextInt();
		
		System.out.println("Enter the ending range:");
		int ep=sc.nextInt();
		
		while(sp<=ep) {
			if(sp%2==0 && sp%3==0) {
				System.out.println(sp);
			}
			sp++;
		}

	}

}
