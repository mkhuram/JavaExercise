package looptest;

public class Iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 541;
		if (num > 1000) {
			System.out.println("A");
			if (num > 5000) {
				System.out.println("E");
				if (num > 10000) {
					System.out.println("F");
					if (num > 12000) {
						System.out.println("J");
					}
				}
				
				else {
					System.out.println("G");
					if (num < 9000) {
						System.out.println("H");
					}
					
					else {
						System.out.println("I");
					}
				}
			}
		}
		
		else {
			System.out.println("B");
			if (num > 500) {
				System.out.println("C");
				System.out.println("2");
				if (num > 700) {
					System.out.println("M");
				}
				
				else {
					System.out.println("N");
				}
			}
			
			else {
				System.out.println("D");
				if (num < 50) {
					System.out.println("K");
				}
				
				else {
					System.out.println("L");
				}
			}
		}

	}

}
