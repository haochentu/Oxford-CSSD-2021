public class ShapeFactory {
	public ShapeFac getShape(String shapeType) {
		if(shapeType == null) {
			return new CircleFac();
		}
		return null;
	}
}
