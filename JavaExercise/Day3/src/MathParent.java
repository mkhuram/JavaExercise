
class MathParent {
	public void Add(int A, int B) {
		int C;
		C = A + B;
		System.out.println("Result :" +C);
	}
	
	public void Sub(int A, int B) {
		System.out.println(A - B);
	}
}


class MathChild extends MathParent {
	public void Mult(int A, int B) {
		System.out.println("Result :" +(A * B));
	}
	
	public void Sub(int A, int B) {
		System.out.println("Result :" +(A - B));
	}
}