import java.awt.Rectangle;
import java.util.Random;

public class Hello_World {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Random generator = new Random();
		Rectangle MyRectangle = new Rectangle(generator.nextInt(100),generator.nextInt(100));
		
		long rectangleArea = CalculateRectangleArea(MyRectangle);
		long rectanglePerimeter = CalculateRectanglePerimeter(MyRectangle);
		Print(MyRectangle, rectangleArea, rectanglePerimeter);
		
		Rectangle MyRectangle2 = new Rectangle(generator.nextInt(100),generator.nextInt(100));
		long rectangleArea2 = CalculateRectangleArea(MyRectangle2);
		long rectanglePerimeter2 = CalculateRectanglePerimeter(MyRectangle2);
		Print(MyRectangle2, rectangleArea2, rectanglePerimeter2);
		
	}
	
	public static long CalculateRectangleArea(Rectangle r){
		long rectangleArea = Math.round(r.getWidth() * (r.getHeight()));
		return rectangleArea;
	}
	
	public static long CalculateRectanglePerimeter(Rectangle r){
		long rectanglePerimeter = Math.round(2 * (r.getWidth() + r.getHeight()));
		return rectanglePerimeter;
	}
	
	public static void Print(Rectangle r, long area, long perimeter){
		System.out.println("rectangle width = " + r.getWidth());
		System.out.println("rectangle height = " + r.getHeight());
		System.out.println("rectangle area = " + area);
		System.out.println("rectangle perimeter = " + perimeter + "\n");
	}

}