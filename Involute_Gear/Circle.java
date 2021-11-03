import java.awt.*;
import java.awt.geom.*;

public class Circle {
	
	private double x;
	private double y;
	private double r;
	private Color color; 

	public Circle(double x, double y, double r, Color color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color; 
		
	}
	
	public void drawCircle(Graphics2D g2d) {
		Ellipse2D.Double e = new Ellipse2D.Double(x-r, y-r, 2*r, 2*r);
		g2d.setColor(color);
		g2d.fill(e);
	}
}

