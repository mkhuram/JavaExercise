//Exercise 12
/*
 * BLACKJACK
Given 2 integer values greater than 0, return whichever value is closest to 21 without
going over 21. If they both go over 21 then return 0
 */

public class blackjack {
	public void blackfun(int firstNumber, int secondNumber) {
		if (firstNumber > 21 && secondNumber > 21) {
			System.out.println("Invalid Numbers");
		}	
		else if(firstNumber > 21) {
			System.out.println("First number is :" +firstNumber);
			
		}
		else if(secondNumber > 21) {
			System.out.println("Second number is :" +secondNumber);
			
		}
		else if(firstNumber > secondNumber) {
			System.out.println("First number is close to 21 :" +firstNumber);
		}
		
		else if(secondNumber > firstNumber) {
			System.out.println("Second number is close to 21 :" +secondNumber);
		}
		return;
	}
}
