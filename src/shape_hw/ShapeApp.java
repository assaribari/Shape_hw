package shape_hw;

public class ShapeApp {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(2);
		point1.setY(5);
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);

		point1.draw();
		point2.draw();
		point1.visible(true);
		point2.visible(false);
		
		ColorPoint point3 = new ColorPoint();
		point3.setX(20);
		point3.setY(30);
		point3.setColor("red");
		point3.draw();
		
	    Rect rect = new Rect();
	    Circle circle = new Circle();
	    Triangle triangle = new Triangle();
	    rect.draw();
	    circle.draw();
	    triangle.draw();
	    
	    rect.visible(true);
	    circle.visible(false);
	    triangle.visible(false);
	    
	    
	}

}
