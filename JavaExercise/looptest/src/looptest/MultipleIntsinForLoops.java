package looptest;

public class MultipleIntsinForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		for(A = 1, B = 10, C = 100; A <= 10;) {
			System.out.println(A+ " - " +B+ " - " +C);
			A++;
			B += 10;
			C += 100;
		}
	}

}
