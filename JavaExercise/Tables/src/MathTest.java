
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math x = new Math();
		x.Add(5, 5);
		x.Add(6, 4);
		
		int Result;
		Result = x.Subtract(5, 3);
		System.out.println(Result);
		
		int Result2;
		Result2 = x.Subtract(4, 3);
		System.out.println(Result2);
		
		int Result3 = Result + Result2;
		System.out.println(Result3);
		
		x.Add2(26);
		System.out.println("Sum of these two digits is : " +x.Add2(26));
		int Result4;
		Result4 = x.Add2(99);
		System.out.println("Sum of these two digits is : " +Result4);
		
		int Result5 = x.Add3(777);
		System.out.println("Sum of these three digits is : " +Result5);
		
		int Result6 = x.Add3(999);
		System.out.println("Sum of these three digits is : " +Result6);
		
		
		int B1, A1 = 10;
		B1 = 4;
		if(B1 > 5 && ++A1 > 10) {
			System.out.println(A1);
		}
		else {
			System.out.println(B1);
		}
	}

}
