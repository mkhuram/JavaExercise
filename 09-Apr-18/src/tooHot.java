//Exercise 14
/*
 * TOO HOT?
Given an integer value and a Boolean value, temperature and isSummer, if temperature
is between 60 and 90 (inclusive), unless its summer where the upper limit is
100 instead of 90. Return true if the temperature falls within the range, false otherwise.
 */
public class tooHot {
	public boolean hotFunc(int temp, boolean isSummer) {
		if(temp >=60 && temp <= 90 && isSummer == false)
		return true;
		else if(temp > 90 && temp <= 100)
			return false;
		else
		return isSummer;
	}
}
