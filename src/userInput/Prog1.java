package userInput;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a integer number:");
		int a=sc.nextInt();
		
		System.out.println("Enter a decimal number:");
		double d=sc.nextDouble();
		
		//to avoid taking "enter" in the nextLine() in str
		sc.nextLine();		
		System.out.println("Enter a Sentence:");
		String str=sc.nextLine();
		
		System.out.println("Enter a word:");
		String word=sc.next();
		
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		
		System.out.println("You have entered the integer: "+a);
		System.out.println("You have entered the decimal: "+d);
		System.out.println("You have entered the sentence: "+str);
		System.out.println("You have entered the word: "+word);
		System.out.println("You have entered the character: "+ch);
		
		sc.close();

	}

}

