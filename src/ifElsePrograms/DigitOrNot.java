package ifElsePrograms;

public class DigitOrNot {

	public static void main(String[] args) {
		char ch='5';
		
//		int c=(int)ch;
		
		if(ch>='0' && ch<='9') {
			System.out.println(ch +" is an digit");
		}
		else {
			System.out.println(ch +" is not a digit");
		}

	}

}
