
public class TimeTable3 {
	public void printTimeTable3(int Table, int Repeat) {
		for (; Table <= Repeat; Table++) {
			System.out.println("Times Table of : " + Table);
			System.out.println("---------------------------");
			for (int y = 1; y <= 10; y++) {
				System.out.println(Table + " x " + y + " = " +(Table*y));
			}
		}
	}
	
	
	public void printTimeTable4(int Table, int Repeat) {
		if (Table < Repeat) {
			for (; Table <= Repeat; Table++) {
				System.out.println("Times Table of : " + Table);
				System.out.println("---------------------------");
				for (int y = 1; y <= 10; y++) {
					System.out.println(Table + " x " + y + " = " +(Table*y));
				}
			}
		}
		
		else {
			for (; Table >= Repeat; Table--) {
				System.out.println("Times Table of : " + Table);
				System.out.println("---------------------------");
				for (int y = 1; y <= 10; y++) {
					System.out.println(Table + " x " + y + " = " +(Table*y));
				}
			}
		}
	}
}
