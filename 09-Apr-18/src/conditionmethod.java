//Exercise 6
/*
 * CONDITIONALS
Modify your method from the previous task to accept another parameter, a
Boolean, which if it is true, the method will return a sum of the two numbers, and if
it is false it will return the multiplication of the two numbers.
 */
public class conditionmethod {
	public int conditionfunction(int n1, int n2, boolean d) {
		 int calc;
	      if(d == true)
	         calc = n1 + n2;
	      else
	         calc = n1 * n2;
	      return calc; 

	}
}
