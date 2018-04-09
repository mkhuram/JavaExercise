//Exercise 14
/*
 * TOO HOT?
Given an integer value and a Boolean value, temperature and isSummer, if temperature
is between 60 and 90 (inclusive), unless its summer where the upper limit is
100 instead of 90. Return true if the temperature falls within the range, false otherwise.
 */
//Main Method
public class tooHota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tooHot T = new tooHot();
		System.out.println(T.hotFunc(65, false));
		System.out.println(T.hotFunc(55, true));
		System.out.println(T.hotFunc(95, true));
	}

}
