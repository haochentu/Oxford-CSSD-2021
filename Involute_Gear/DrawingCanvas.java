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
	
	public DrawingCanvas(int w, int h) {   
		c1 = new Circle(400, 400, 302, Color.YELLOW);   //call Circle class
		c2 = new Circle(400, 400, 250, Color.BLUE);
		
		it1 = new InvoluteTeeth(400, 400, 200, 80, 12, Color.RED); //call InvoluteTeeth class, 
	    //here user can define the number of teeth they want, the maximum is 12 within the setting here. 
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
				
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		c1.drawCircle(g2d);  //call drawCircle method
		c2.drawCircle(g2d);
		
		it1.drawInvoluteTeeth(g2d); //call InvoluteTeeth method 
		
	}
}
