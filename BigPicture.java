public class BigPicture {

	/*
	 * Attribute (Instanzvariablen) der Klasse Test
	 */
	private Square wall;
	private Square window;
	private Triangle roof;
	private Circle sun;
	private Cloud cloud1, cloud2;
	private Flower flower1, flower2;
	
	/*
	 * Standardkonstruktor (Konstruktor ohne Parameter)
	 */
	public BigPicture() {
		wall  = new Square();
		window = new Square();
		roof = new Triangle();
		sun = new Circle();
		cloud1 = new Cloud();
		cloud2 = new Cloud();
		flower1 = new Flower();
		flower2 = new Flower();
	}
	
	/*
	 * Methoden der Klasse
	 */
	public void draw() {
		wall.moveVertical(80);
        wall.changeSize(100);
		window.moveHorizontal(20);
        window.moveVertical(100);
		roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        cloud1.moveHorizontal(150);
        cloud2.moveHorizontal(30);
        cloud2.moveVertical(20);
        flower1.moveVertical(180);
        flower1.moveHorizontal(-30);
        flower2.moveVertical(180);
        flower2.moveHorizontal(150);
        setColor();
	}
	
	public void makeVisible() {
		wall.makeVisible();
		window.makeVisible();
		roof.makeVisible();
		sun.makeVisible();
		cloud1.makeVisible();
		cloud2.makeVisible();
		flower1.makeVisible();
		flower2.makeVisible();
	}
	
	public void makeInvisible() {
		wall.makeInvisible();
		window.makeInvisible();
		roof.makeInvisible();
		sun.makeInvisible();
		cloud1.makeInvisible();
		cloud2.makeInvisible();
		flower1.makeInvisible();
		flower2.makeInvisible();
	}
	
	public void setColor() {
		if (wall != null) {
			wall.changeColor("red");
			window.changeColor("black");
			roof.changeColor("green");
			sun.changeColor("yellow");
			cloud1.changeColor("green");
			cloud2.changeColor("green");
		}
	}
	
	public void setBlackAndWith() {
		if (wall != null) {
			wall.changeColor("black");
			window.changeColor("white");
			roof.changeColor("black");
			sun.changeColor("black");
			cloud1.changeColor("black");
			cloud2.changeColor("black");
			flower1.changeColor("black");
			flower2.changeColor("black");
		}
	}

	public void moveClouds(int distance){
		cloud1.slowMoveHorizontal(distance);
		cloud2.slowMoveHorizontal(distance);
	}
	
}