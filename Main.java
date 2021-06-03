public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		BigPicture picture = new BigPicture();
		picture.draw();
		picture.makeVisible();

		picture.moveClouds(-20);
		Thread.sleep(1000);
		picture.setBlackAndWith();
		
		picture.moveClouds(20);
		Thread.sleep(1500);
		picture.makeInvisible();
	}

}