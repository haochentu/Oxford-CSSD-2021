import java.awt.*;  //for color and Graphics
import java.awt.geom.*;  //for create shapes and paths 
import javax.swing.*;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;

public class DrawingCanvas extends JComponent {
	private Circle c1;
	private Circle c2;
	private InvoluteTeeth it1; 
	
	public DrawingCanvas(int w, int h, int r, int teethNumber, int circleDiameter) { 
		
		c1 = new Circle(circleDiameter, circleDiameter, 265, Color.PINK);   //call Circle class
		c2 = new Circle(circleDiameter, circleDiameter, r, Color.YELLOW);
		
		it1 = new InvoluteTeeth(r, 0,0,0, 0, 0,0,0, teethNumber, Color.BLUE); //call InvoluteTeeth class, 
	    //here user can define the number of teeth they want, the maximum is 12 within the setting here. 
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
				
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		c1.drawCircle(g2d);  //call drawCircle metSystem.out.println("x1 is " + x1); hod
		c2.drawCircle(g2d);
		
		it1.drawInvoluteTeeth(g2d); //call InvoluteTeeth method 
	}
}
