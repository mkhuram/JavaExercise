
class ABC {
	public ABC() {
		this(2);
		System.out.println(1);
	}
	
	public ABC(int A) {
		this(7, 2);
		System.out.println(A + 5);
	}
	
	public ABC(int A, int B) {
		System.out.println("Hello");
	}
}
