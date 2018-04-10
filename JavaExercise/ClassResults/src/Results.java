
public class Results {
	private boolean IPhy, IChe, IMath;
	private int Failed, Phy, Che, Math;
	private float Per, Tot;
	
	public void Physics(int A) {
		if(A >= 0 && A <= 150)
			{
				Phy = A;
				if (A < 90)
				{
					Failed = Failed + 1;
					System.out.println("You failed Physics");
				}
			}
		else
		{
			System.out.println("Invalid value for Physics");
			IPhy = true;
		}
	}
	
	public void Chemistry(int B) {
		if(B >= 0 && B <= 150)
			{
				Che = B;
				if (B < 90)
				{
					Failed = Failed + 1;
					System.out.println("You failed Chemistry");
				}
			}
		else
		{
			System.out.println("Invalid value for Chemistry");
			IChe = true;
		}
	}
	
	public void Mathematics(int C) {
		if(C >= 0 && C <= 150)
			{
				Math = C;
				if (C < 90)
				{
					Failed = Failed + 1;
					System.out.println("You failed Mathematics");
				}
			}
		else
		{
			System.out.println("Invalid value for Mathematics");
			IMath = true;
		}
	}
	
	private void Calculations() {
		Tot = Phy + Che + Math;
		Per = Tot * 100 / 450;
	}
	
	
	public void ShowResults() {
		if (IPhy == false && IChe == false && IMath == false)
		{
			if (Failed == 1)
				System.out.println("Retake Exam");
			if (Failed == 2)
				System.out.println("Repeat the Course");
			if (Failed == 3)
				System.out.println("Go Home");
			if (Failed == 0)
			{
				Calculations();
				System.out.println("Total Marks: " +Tot);
				System.out.println("Percentage: " +Per);
			}
		}
	}
}
