package ifElsePrograms;

public class LeapYearShort {

	public static void main(String[] args) {
		int year=2008;
		if(((year%100==0)&&(year%400==0))||((year%100!=0)&&(year%4==0))) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}

	}

}
