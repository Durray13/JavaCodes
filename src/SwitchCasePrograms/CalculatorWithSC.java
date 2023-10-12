package SwitchCasePrograms;

public class CalculatorWithSC {
	public static void main(String args[]) {
		int n1=15;
		int n2=3;
		char op='*';
		
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
			System.out.println((double)n1/n2);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("End of Program");
	}

}
