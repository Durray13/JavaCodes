package ifElsePrograms;

public class ScoreCard {

	public static void main(String[] args) {
		int s=-9;
		String result;
		
		if(s<0 || s>100) {
			result="Score is invalid";
		}
		else if(s>=91 && s<=100) {
			result="A+";
		}
		else if(s>=81 && s<=90) {
			result="A";
		}
		else if(s>=71 && s<=80) {
			result="B+";
		}
		else if(s>=61 && s<=70) {
			result="B";
		}
		else if(s>=51 && s<=60) {
			result="C";
		}
		else if(s>=41 && s<=50) {
			result="D";
		}
		else {
			result="F";
		}
		
		System.out.println(result);

	}

}
