package oopsConcepts;

public class Area extends Shape {
	public void RectangleArea(int l,int b) {
		int rectarea;
		rectarea=l*b;
		System.out.println("Rectanle Area: "+rectarea);
	}
	public void SquareArea(int side) {
		int sqrarea;
		sqrarea=side*side;
		System.out.println("Square Area: "+sqrarea);
	}
	public void CircleArea(float radius) {
		float crarea;
		crarea=3.14f+(float)(radius*radius);
		System.out.println("Circle Area: "+crarea);
	}
	
	public static void main(String[] args) {
		
		Area area=new Area();
		
		area.RectangleArea(5,8);
		area.SquareArea(5);
		area.CircleArea(6);
		
		
	}

}
