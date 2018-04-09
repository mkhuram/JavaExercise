//Exercise 9
/*
 * ARRAYS
Create an array that will hold 10 integer values, populate the array with values,
then call and output the result of your method from Conditionals 2, passing values
that are stored in the array as arguments to the method.
 */
//Main Method

public class array1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array1 a = new array1();
		int mylist[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		for(int i = 0; i < mylist.length; i++) {
//			System.out.println(a.arrayfunc(mylist[i], 0));
//			System.out.println(a.arrayfunc(0, mylist[i]));
			System.out.println(a.arrayfunc(mylist[i], mylist[i]));
		}
	}

}
