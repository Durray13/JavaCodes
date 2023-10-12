package loops.ForLoops;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		double s=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				s=s-((double)1/i);
			}
			else {
				s=s+((double)1/i);
			}
		}
		System.out.println("Sum: "+s);

	}

}
