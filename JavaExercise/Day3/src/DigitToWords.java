
public class DigitToWords {
	private String Ones (int A) {
		String Word = "";
		switch(A) {
			case 1: 
				Word = " One";
				break;
			case 2:
				Word = " Two";
				break;
			case 3:
				Word = " Three";
				break;
			case 4:
				Word = " Four";
				break;
			case 5:
				Word = " Five";
				break;
			case 6:
				Word = " Six";
				break;
			case 7:
				Word = " Seven";
				break;
			case 8:
				Word = " Eight";
				break;
			case 9:
				Word = " Nine";
				break;
			case 10:
				Word = "Ten";
				break;
			case 11:
				Word = "Eleven";
				break;
			case 12:
				Word = "Twelve";
				break;
			case 13:
				Word = "Thirteen";
				break;
			case 14:
				Word = "Fourteen";
				break;
			case 15:
				Word = "Fifteen";
				break;
			case 16:
				Word = "Sixteen";
				break;
			case 17:
				Word = "Seventeen";
				break;
			case 18:
				Word = "Eighteen";
				break;
			case 19:
				Word = "Nineteen";
				break;
		}
		
		return Word;
	}
	
	private String Ty (int B) {
		String Word = "";
		switch(B) {
			case 20: 
				Word = "Twenty";
				break;
			case 30:
				Word = "Thirty";
				break;
			case 40:
				Word = "Fourty";
				break;
			case 50:
				Word = "Fifty";
				break;
			case 60:
				Word = "Sixty";
				break;
			case 70:
				Word = "Seventy";
				break;
			case 80:
				Word = "Eighty";
				break;
			case 90:
				Word = "Ninety";
				break;
		}
		
		return Word;
	}
	
	
	public void Print(int digit) {
		String Result = "";			
		if(digit >= 1000 & digit < 9999) {
			Result = Ones(digit/1000) + " Thousand ";
			digit = digit - ((digit/1000) * 1000);
		}
		
		if(digit >= 100 & digit < 1000) {
			Result += Ones(digit/100) + " Hundred ";
			digit = digit - ((digit/100) * 100);
		}
		
		if(digit >= 20 & digit < 100) {
			Result += Ty((digit/10) * 10);
			digit = digit - ((digit/10) * 10);
		}
		
		if (digit < 20) {
			Result += Ones(digit);
		}
		System.out.println(Result);
		
	}
}
