//Exercise 7
/*CONDITIONALS 2
Modify your method from the previous task to have another if statement that checks
if one of the numbers is 0, if this is true then return the other non-0 number.

*/
//Main method

public class conditionmethod2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditionmethod2 con = new conditionmethod2();
		System.out.println(con.conditionfunction(2, 0));
		System.out.println(con.conditionfunction(0, 3));
		System.out.println(con.conditionfunction(2, 6));
	}

}
