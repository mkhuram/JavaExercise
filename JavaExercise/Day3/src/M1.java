//class with all abstract methods can be declared with interface. We must have to override all methods in child class.
interface M1 {
	public void Add(int A, int B);
	public void Sub(int A, int B);
	public void Div(int A, int B);
}

class Math2 implements M1 {
	public void Add(int A, int B) {
		System.out.println("Result :" +(A + B));
	}
	
	public void Sub(int A, int B) {
		System.out.println("Result :" +(A - B));
	}
	
	public void Div(int A, int B) {
		System.out.println("Result :" +(A/B));
	}
	
}
