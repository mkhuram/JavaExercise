//Exercise 8
/*
 * ITERATION
Create a for loop that will call and output the result of your method from Conditionals
2 10 times, using the current iteration as one of the parameters you pass to it.
 */

public class iterationfunction {

	public int iterationfunc(int n1, int n2) {
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
