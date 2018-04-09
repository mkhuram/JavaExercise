//Exercise 6
/*
 * CONDITIONALS
Modify your method from the previous task to accept another parameter, a
Boolean, which if it is true, the method will return a sum of the two numbers, and if
it is false it will return the multiplication of the two numbers.
 */
//Main Method

public class conditionmethoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditionmethod con = new conditionmethod();
		int calc = con.conditionfunction(5, 5, true);
		System.out.println(calc);
		
		int calc2 = con.conditionfunction(5, 5, false);
		System.out.println(calc2);
	}

}
