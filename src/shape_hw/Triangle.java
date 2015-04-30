package shape_hw;

public class Triangle extends Shape implements Drawable {
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	@Override
	public double calculaterArea() {
		return height * width / 2;
	}
	@Override
	public void visible(boolean vis) {
		if(vis == true) {
			draw();
		}else{
			System.out.println("삼각형을 지웠습니다.");
		}
	}
	
	
}
