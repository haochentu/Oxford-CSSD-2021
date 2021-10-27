
public class DrawCircleFactory {
	   public static void main(String[] args) {
		      ShapeFactory shapeFactory = new ShapeFactory();

		      //get an object of Circle and call its draw method.
		      ShapeFac circle = shapeFactory.getShape(null);

		      //call draw method of Circle
		      circle.drawCircle();
	   }

}
