package looptest;

public class BreakinForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1;
		for(A = 1; ; A++) {
			System.out.println(A);
			if (A == 10){
			break;	
			}
		}

	}

}
