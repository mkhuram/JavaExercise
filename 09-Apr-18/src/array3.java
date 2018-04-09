//Exercise 11
/*
 * ITERATION/ARRAYS 2
Create a for loop that populates an integer array with values, outputting them at
each iteration. Then create another loop that iterates through the array, changing
the values at each point to equal itself times 10, outputting them at each iteration.
 */

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mylist[] = new int[10];
		for(int i = 0; i < 10; i++) {
			mylist[i] = i;
			System.out.print(mylist[i]);
			System.out.print(",");
		}
		System.out.println();
		for(int j = 0; j < mylist.length; j++) {
			mylist[j] *= 10;
			System.out.print(mylist[j]);
			System.out.print(",");
		}
	}

}
