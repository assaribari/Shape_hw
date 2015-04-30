package shape_hw;

public class ColorPoint extends Point{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("좌표[x="+getX()+",y="+getY()+
				",color="+getColor()+"]에 점을 그렸습니다.");
	}
	
	
}
