//Exercise 9
/*
 * ARRAYS
Create an array that will hold 10 integer values, populate the array with values,
then call and output the result of your method from Conditionals 2, passing values
that are stored in the array as arguments to the method.
 */

public class array1 {
	public int arrayfunc(int n1, int n2) {
		int calc = 0;
		      if(n1 == 0)
		         calc = n2;
		      if (n2 == 0)
		    	  calc = n1;
		      else
		         calc = n1 + n2; 
			 
		return calc;
	}
}
