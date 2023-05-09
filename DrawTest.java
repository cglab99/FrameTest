
public class DrawTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(7, 5);
		shape[2] = new Triangle(8, 9);
		
		System.out.println(shape[0].getArea());
		System.out.println(shape[1].getArea());
		System.out.println(shape[2].getArea());
		
		for(int i=0;i<shape.length;i++) {
			System.out.println(shape[i].getArea());
		}
		
		for(Shape s : shape ) {
			System.out.println(s.getArea());
		}
		
	}

}
class Shape {
	double x, y;
	double getArea() {
		return 0;
	};
}

class Circle extends Shape {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}
}
class Rectangle extends Shape {
	double length;
	double height;
	Rectangle(double length, double height){
		this.length = length;
		this.height = height;
	}
	double getArea() {
		return length * height;
	}
}

class Triangle extends Shape {
	double base;
	double height;
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	double getArea() {
		return base * height / 2;
	}
}
