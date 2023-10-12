package ifElsePrograms;

public class DigitAlpSpeOrNot {

	public static void main(String[] args) {
		char ch='A';

		//		int c=(int)ch;

		if(ch>='0' && ch<='9') {
			System.out.println(ch +" is an digit");
		}
		else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch +" is an alphabet");
		}
		else {
			System.out.println(ch +" is a special character");
		}

	}

}
