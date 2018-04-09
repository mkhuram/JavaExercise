//Exercise 8
/*
 * ITERATION
Create a for loop that will call and output the result of your method from Conditionals
2 10 times, using the current iteration as one of the parameters you pass to it.
 */
//Main Method

public class iterationfunctiona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterationfunction i = new iterationfunction();
		for(int k = 0; k <= 10; k++) {
		System.out.println(i.iterationfunc(k, 0));
		System.out.println(i.iterationfunc(0, k));
		System.out.println(i.iterationfunc(k, k));
		}
	}

}
