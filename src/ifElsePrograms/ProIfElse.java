package ifElsePrograms;

public class ProIfElse {

	public static void main(String[] args) {
		
		//Finding largest of 3 numbers
		int a=789898;
		int b=6568797;
		int c=987897;
		if(a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>c) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}

	}

}
