
public class Results {
	int Physics, Chemistry, Mathematics;
	float Percentage, Total;
	
	public void ShowResults() {
		Total = Physics + Chemistry + Mathematics;
		Percentage = Total * 150/450;
		System.out.println(Total);
		System.out.println(Percentage);
	}

}
