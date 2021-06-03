public class Cloud {

	private Circle c1, c2, c3, c4;
	
	public Cloud() {
		c1 = new Circle(30, 20, 0, "green", false);
		c2 = new Circle(30, 30, 10, "green", false);
		c3 = new Circle(30, 10, 10, "green", false);
		c4 = new Circle(30, 20, 20, "green", false);
	}
	
	public void makeVisible() {
		c1.makeVisible();
		c2.makeVisible();
		c3.makeVisible();
		c4.makeVisible();
	}
	
	public void makeInvisible() {
		c1.makeInvisible();
		c2.makeInvisible();
		c3.makeInvisible();
		c4.makeInvisible();
	}
	
	public void moveHorizontal(int distance) {
		c1.moveHorizontal(distance);
		c2.moveHorizontal(distance);
		c3.moveHorizontal(distance);
		c4.moveHorizontal(distance);
	}
	
	public void moveVertical(int distance) {
		c1.moveVertical(distance);
		c2.moveVertical(distance);
		c3.moveVertical(distance);
		c4.moveVertical(distance);
	}
	
	public void slowMoveHorizontal(int distance) {
		int delta;
		
		if (distance < 0) {
			delta = -1;
			distance = -distance;
		} else {
			delta = 1;
		}

		for (int i = 0; i < distance; i++) {
			c1.moveHorizontal(delta);
			c2.moveHorizontal(delta);
			c3.moveHorizontal(delta);
			c4.moveHorizontal(delta);
		}
	}
	
	public void slowMoveVertical(int distance) {
		int delta;
		
		if (distance < 0) {
			delta = -1;
			distance = -distance;
		} else {
			delta = 1;
		}

		for (int i = 0; i < distance; i++) {
			c1.moveVertical(delta);
			c2.moveVertical(delta);
			c3.moveVertical(delta);
			c4.moveVertical(delta);
		}
	}
	
	public void changeColor(String newColor) {
		c1.changeColor(newColor);
		c2.changeColor(newColor);
		c3.changeColor(newColor);
		c4.changeColor(newColor);
	}
	
}