package looptest;

public class MultipleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1;
		while (A <= 10) {
			System.out.println();
			int B = 1;
			while (B <= A) {
				System.out.print(A);
				B = B + 1;
			}
			
			A = A + 1;
		}
	}

}
