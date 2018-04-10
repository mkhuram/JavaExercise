
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Peter's marks are");
		Results Peter;
		Peter = new Results();
		Peter.Physics(95);
		Peter.Chemistry(80);
		Peter.Mathematics(120);
		System.out.println();
		Peter.ShowResults();
		System.out.println("------------------------------");
		
		System.out.println("Sam's marks are");
		Results Sam;
		Sam = new Results();
		Sam.Physics(60);
		Sam.Chemistry(140);
		Sam.Mathematics(100);
		System.out.println();
		Sam.ShowResults();
		System.out.println("------------------------------");
		
		System.out.println("Johns' marks are");
		Results John;
		John = new Results();
		John.Physics(100);
		John.Chemistry(100);
		John.Mathematics(100);
		System.out.println();
		John.ShowResults();
		System.out.println("------------------------------");
		
		System.out.println("Smith's marks are");
		Results Smith;
		Smith = new Results();
		Smith.Physics(120);
		Smith.Chemistry(80);
		Smith.Mathematics(70);
		System.out.println();
		Smith.ShowResults();
		System.out.println("------------------------------");
		
		System.out.println("Joe's marks are");
		Results Joe;
		Joe = new Results();
		Joe.Physics(60);
		Joe.Chemistry(80);
		Joe.Mathematics(70);
		System.out.println();
		Joe.ShowResults();
		System.out.println("------------------------------");
	}

}
