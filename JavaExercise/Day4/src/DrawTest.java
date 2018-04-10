//We can call a reference variable for example (Draw X) in the method. This reference variable (Draw X) can then be replaced by child 
//reference variable as well. In this case, Line and Circle are child of Draw, so instead of Parent, we can call child reference variable
// as well. In this example it is Drawing(L) and Drawing(C).
public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line L = new Line();
		Drawing(L);
		Circle C = new Circle();
		Drawing(C);
	}

	public static void Drawing(Draw X) {
		X.doDraw();
	}
}