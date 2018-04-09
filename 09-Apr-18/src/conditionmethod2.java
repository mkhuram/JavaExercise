//Exercise 7
/*CONDITIONALS 2
Modify your method from the previous task to have another if statement that checks
if one of the numbers is 0, if this is true then return the other non-0 number.

*/

public class conditionmethod2 {
	public int conditionfunction(int n1, int n2) {
		 int calc;
	      if(n1 == 0)
	         calc = n2;
	      if (n2 == 0)
	    	  calc = n1;
	      else
	         calc = n1 + n2;
	      return calc; 

	}
}

