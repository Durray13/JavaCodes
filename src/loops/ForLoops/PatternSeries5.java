package loops.ForLoops;

import java.util.Scanner;

public class PatternSeries5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(n-r+1);
			}
			System.out.println();
		}
	}

}