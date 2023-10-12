package userInput;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String s1=sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.print("I am \""+s1+"\". \nI am "+age+" years old.");

	}

}
