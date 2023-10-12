package userInput;

import java.util.Scanner;

public class CalculatorWithUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n1=sc.nextInt();

		System.out.println("Enter the second number: ");
		int n2=sc.nextInt();
		
		System.out.println("Enter + to add, - to subtract, * to multiply and / to divide: ");
		char op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(n1+n2);
			break;
		case '-':
			System.out.println(n1-n2);
			break;
		case '*':
			System.out.println(n1*n2);
			break;
		case '/':
			System.out.println(n1/n2);
			break;
		default:
			System.out.println("Invalid \n Choice");
		}
		

	}

}
