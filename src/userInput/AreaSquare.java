package userInput;

import java.util.Scanner;

public class AreaSquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the lenght of the square: ");
		int l=sc.nextInt();
		
		int a=l*l;
		int p=4*l;
		
		System.out.println("Area: "+a+" Permeter: "+p);

	}

}
