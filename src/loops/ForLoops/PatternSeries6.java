package loops.ForLoops;

import java.util.Scanner;

public class PatternSeries6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n-r+1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
