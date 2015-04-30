package shape_hw;

public class Circle extends Shape implements Drawable{
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	
	@Override
	public double calculaterArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public void visible(boolean vis) {
		if(vis == true) {
			draw();
		}else{
			System.out.println("원을 지웠습니다.");
		}
	}
	
}
