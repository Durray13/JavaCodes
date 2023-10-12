package loops.WhileLoops;

public class SumOfEven {

	public static void main(String[] args) {
		int sp=30;
		int ep=40;
		int sum=0;
		while(sp<=ep) {
			if(sp%2==0) {
				sum=sum+sp;
			}
			sp++;
		}
		System.out.println("Sum: "+sum);

	}

}
