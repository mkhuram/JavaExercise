package looptest;

public class TwoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1;
		while (A <= 10) {
			System.out.println();
			int B = 1;
			while (B <= 10) {
				System.out.print(B);
				B = B + 1;
			}
			
			A = A + 1;
		}
	}

}
