package ifElsePrograms;

public class AlphabetOrNot
{
	public static void main(String[] args) {	
		
		char ch='Z';
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch +" is an alphabet");
		}
		else {
			System.out.println(ch +" is not an alphabet");
		}

	}

}
