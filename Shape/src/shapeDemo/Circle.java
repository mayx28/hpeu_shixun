package shapeDemo;

public class Circle extends Shape {
	public void girth() {
		super.girth();
		System.out.println("圆形的周长是......." );
	}

	public void area() {
		super.area();
		System.out.println("圆形的面积是......." );
	}
}
