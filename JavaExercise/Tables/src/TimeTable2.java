
public class TimeTable2 {
	public void printTimeTable(int Table, int Range) {
		System.out.println("Time Table of : " +Table);
		System.out.println("-------------------------");
		for(int A = 1; A <= Range; A++) {
			System.out.println(Table + " x " + A + " = " + (Table*A));
		}
	}
}
