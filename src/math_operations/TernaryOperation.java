package math_operations;

public class TernaryOperation {

	public static void main(String[] args) {
		int a=78;
		int b=98;
		int c=56;
		
		int greatest_no=(a>b)&&(a>c)?a:(b>c)?b:c;
		
		System.out.println(greatest_no +" is the largest");

		
	}

}
