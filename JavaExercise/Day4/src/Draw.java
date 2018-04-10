
interface Draw {
	public void doDraw();
}


class Line implements Draw {
	public void doDraw() {
		System.out.println("Draw Line");
	}
}

class Circle implements Draw {
	public void doDraw() {
		System.out.println("Draw Circle");
	}
}
