package SwitchCasePrograms;

public class GradingSystem {
	public static void main(String args[]) {
		String g="C";
		switch (g) {
		case "A+":
			System.out.println("91-100");
			break;
		case "A":
			System.out.println("81-90");
			break;
		case "B+":
			System.out.println("71-80");
			break;
		case "B":
			System.out.println("61-70");
			break;
		case "C":
			System.out.println("51-60");
			break;
		case "D":
			System.out.println("41-50");
			break;
		case "F":
			System.out.println("<=40");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
			
		}
	}

}
