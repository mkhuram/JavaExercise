
public class TimeTable {
	public void printTimeTable(int Table) {
		System.out.println("Times Table of : " + Table);
		System.out.println("-----------------------------");
		for(int x = 1; x <= 10; x++) {
			System.out.println(Table + " x " + x + " = " + (Table*x));
		}
	}
}
