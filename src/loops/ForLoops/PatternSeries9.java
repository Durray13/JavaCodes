package loops.ForLoops;

import java.util.Scanner;

public class PatternSeries9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
//		int count=1;
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n-r+1;c++) {
//				if(count%2==0) {
//					System.out.print("0 ");
//				}
//				else {
//					System.out.print("1 ");
//				}
//				count++;
				
				System.out.print(c%2 +" ");
//				count++;
			}
//			count=1;
			System.out.println();
		}
	}

}
