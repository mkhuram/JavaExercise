
public class Account {
	public void Tax() {
		System.out.println("Tax Rate Is: " +21);
	}
	
	public void Tax(int Salary) {
		float T;
		T = (float)Salary*21/100;
		System.out.println("Your Tax is: " +T);
	}
	
	public void Tax(int Salary, float Rate) {
		float T;
		T = Salary * Rate/100;
		System.out.println("Your Tax is: " +T); 
	}
}
