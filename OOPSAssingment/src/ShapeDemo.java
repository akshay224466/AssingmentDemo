
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape line=new Line();
		Shape rectangle=new Rectangle();
		Shape cube=new Cube();
		line.draw();
		rectangle.draw();
		cube.draw();

	}

}
abstract class Shape{
	abstract void draw();
	}
class Line extends Shape{
	void draw() {
		System.out.println("Line is Running");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle is running");
	}
}

class Cube extends Shape{
	void draw() {
		System.out.println("Cube is running");
	}
	
}