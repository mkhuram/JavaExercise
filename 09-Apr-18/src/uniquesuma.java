//Exercise 13
/*
 * UNIQUE SUM
Given 3 integer values, return their sum. If one value is the same as another value,
they do not count towards the sum. Aka only return the sum of unique numbers
given.
 */
//Main Method

public class uniquesuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniquesum u = new uniquesum();
		System.out.println(u.UniqueFunc(1, 2, 3));
		System.out.println(u.UniqueFunc(1, 1, 3));
		System.out.println(u.UniqueFunc(4, 3, 3));
		System.out.println(u.UniqueFunc(8, 5, 8));
		System.out.println(u.UniqueFunc(8, 8, 8));
		System.out.println(u.UniqueFunc(8, 7, 5));
	}

}
