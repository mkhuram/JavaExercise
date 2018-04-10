
public class Math {
	public void Add(int A, int B) {
		int C;
		C = A + B;
		System.out.println("Result = " +C);
	}
	
	public int Subtract(int A, int B) {
		int D;
		D = A - B;
		return D;
	}
	
	public int Add2(int X) {
		int No1, No2, Result;
		No1 = X/10;
		No2 = X%10;
		Result = No1 + No2;
		return Result;
	}
	
	public int Add3(int X) {
		int No1, No2, No3, Result;
		No1 = X/100;
		No2 = (X%100)/10;
		No3 = X%10;
		Result = No1 + No2 + No3;
		return Result;
	}
}
