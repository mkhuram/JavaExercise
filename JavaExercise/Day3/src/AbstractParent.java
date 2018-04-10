//class with even one abstract method needs to be declared abstract. abstract method is method withoud any body.
abstract public class AbstractParent {
	public void Addition (int A, int B) {
		System.out.println("Result :" +(A + B));
	}
	
	abstract public void Subtraction(int A, int B);
	abstract public void Division(int A, int B);
}

class AbstractChild extends AbstractParent {
	public void Subtraction(int A, int B) {
		System.out.println("Result :" +(A - B));
	}
	
	public void Division(int A, int B) {
		System.out.println("Result :" +(A/B));
	}
}
