//Exercise 13
/*
 * UNIQUE SUM
Given 3 integer values, return their sum. If one value is the same as another value,
they do not count towards the sum. Aka only return the sum of unique numbers
given.
 */

public class uniquesum {
	public int UniqueFunc(int num1, int num2, int num3) {
		int sum=0;
		sum = num1 + num2 + num3;
		if(num1 == num2 && num1 == num3 && num2 == num3) 
			return 0;
		if(num1 == num2)
			return num3;
		if(num2 == num3)
			return num1;
		if(num1 == num3)
			return num2;
		else
			return sum;
		
	}
}
