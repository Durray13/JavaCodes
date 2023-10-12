package ifElsePrograms;

public class LeapYear {

	public static void main(String[] args) {
		int year=2004;
		String l="";
		
		if(year%100==0) {
			if(year%400==0) {
				l="leap year and century year";
			}
			else {
				l="not a leap year";
			}
		}
		else {
			if(year%4==0) {
				l="leap year";
			}
			else {
				l="not a leap year";
			}
		}
		System.out.println(l);

	}

}
