package looptest;

public class Looptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		while (num <= 10) {
			System.out.print(num);
			if (num % 2 == 0) {
				System.out.println(" Even");
			}
			
			else {
				System.out.println(" Odd");
			}
			
			num = num + 1;
		}
	}
}
