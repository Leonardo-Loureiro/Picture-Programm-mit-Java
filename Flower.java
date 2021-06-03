public class Flower {

	private Circle c1, c2, c3, c4, c5;
	private Triangle t1, t2;
	private Square s1, s2, s3, s4;
	
	public Flower() {
		c1 = new Circle(30,50,40, "green", false);
		c2 = new Circle(30,50,20, "green", false);
		c3 = new Circle(30,40,30, "green", false);
		c4 = new Circle(30,60,30, "green", false);
		c5 = new Circle(20,55,35, "yellow", false);
		
		t1 = new Triangle();
		t2 = new Triangle();
		
		s1 = new Square();
		s2 = new Square();
		s3 = new Square();
		s4 = new Square();
		
		t1.changeSize(10, 20);
		t1.moveVertical(75);
		
		t2.changeSize(10, 20);
		t2.moveVertical(60);
		t2.moveHorizontal(30);
		
		s1.changeColor("green");
		s2.changeColor("green");
		s3.changeColor("green");
		s4.changeColor("green");
		
		s1.changeSize(10);
		s2.changeSize(10);
		s3.changeSize(10);
		s4.changeSize(10);
		
		s1.moveVertical(20);
		s2.moveVertical(30);
		s3.moveVertical(40);
		s4.moveVertical(50);
	}
	
	public void makeVisible() {
		c1.makeVisible();
		c2.makeVisible();
		c3.makeVisible();
		c4.makeVisible();
		c5.makeVisible();
		t1.makeVisible();
		t2.makeVisible();
		s1.makeVisible();
		s2.makeVisible();
		s3.makeVisible();
		s4.makeVisible();
	}
	
	public void makeInvisible() {
		c1.makeInvisible();
		c2.makeInvisible();
		c3.makeInvisible();
		c4.makeInvisible();
		c5.makeInvisible();
		t1.makeInvisible();
		t2.makeInvisible();
		s1.makeInvisible();
		s2.makeInvisible();
		s3.makeInvisible();
		s4.makeInvisible();
	}
	
	public void moveHorizontal(int distance) {
		c1.moveHorizontal(distance);
		c2.moveHorizontal(distance);
		c3.moveHorizontal(distance);
		c4.moveHorizontal(distance);
		c5.moveHorizontal(distance);
		t1.moveHorizontal(distance);
		t2.moveHorizontal(distance);
		s1.moveHorizontal(distance);
		s2.moveHorizontal(distance);
		s3.moveHorizontal(distance);
		s4.moveHorizontal(distance);
	}
	
	public void moveVertical(int distance) {
		c1.moveVertical(distance);
		c2.moveVertical(distance);
		c3.moveVertical(distance);
		c4.moveVertical(distance);
		c5.moveVertical(distance);
		t1.moveVertical(distance);
		t2.moveVertical(distance);
		s1.moveVertical(distance);
		s2.moveVertical(distance);
		s3.moveVertical(distance);
		s4.moveVertical(distance);
	}
	
	public void changeColor(String newColor) {
		c1.changeColor(newColor);
		c2.changeColor(newColor);
		c3.changeColor(newColor);
		c4.changeColor(newColor);
		c5.changeColor("white");
		t1.changeColor(newColor);
		t2.changeColor(newColor);
		s1.changeColor(newColor);
		s2.changeColor(newColor);
		s3.changeColor(newColor);
		s4.changeColor(newColor);
	}

}