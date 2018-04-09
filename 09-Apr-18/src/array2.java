//Exercise 10
/*
 * ITERATION/ARRAYS
Using your array that you created in Task 9, create a for loop that iterates through
your array, outputting the values contained within it.
 */

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mylist[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		for(int i = 0; i < mylist.length; i++) {
			System.out.println("The array item at index " +i+ " is " +mylist[i]);
		}
	}

}
