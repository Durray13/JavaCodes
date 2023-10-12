package loops.ForLoops;

import java.util.Scanner;

public class PatternSeries4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		
		for(int r=1;r<=3;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(r+4);
			}
			System.out.println();
		}
	}

}
