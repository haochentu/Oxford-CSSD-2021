import java.awt.*;  //for color and Graphics
import java.awt.geom.*;  //for create shapes and paths 
import javax.swing.*;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class DrawingCanvas extends JComponent {
	private Circle c1;
	private Circle c2;
	
	public DrawingCanvas(int w, int h) {   
		width = w;
		height = h;
		c1 = new Circle(400,400,240,Color.YELLOW);     //call Circle class
		c2 = new Circle(400,400,200,Color.BLUE);
	}
	
	int xCenter;
	int yCenter;
	int r;
	int t; 
	int width; 
	int height; 
	int startAngle; 
	int arcAngle; 
	int cx;
	int cy;
	double arcLength; 
	
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
				
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		c1.drawCircle(g2d);      //call drawCircle method
		c2.drawCircle(g2d);
		
		xCenter = 400;
		yCenter = 400;
		r = 200;
		
		t = 80; 
		double rad = Math.toRadians(t);  
		double sinValue = Math.sin(rad);
		double cosValue = Math.cos(rad); 
	
		double dWidth = r*(cosValue + (rad*sinValue));
		double dHeight = r*(sinValue - (rad*cosValue));
		width = (int)dWidth; 
		height = (int)dHeight; 
		
		arcLength = (r/2) * rad * rad; 
		arcAngle = (int) Math.toDegrees(arcLength/r);  

		//cx = (int) (400 + (r* (Math.cos(2.093)))); 
		//cy = (int) (400 - (r* (Math.sin(2.093)))); 
		
		g.setColor(Color.RED); 
		
		cx = 400; 
		cy = 400; 
		
		g2d.drawArc(cx ,cy, width, height, -77, -20); 
		
		for (int i = 0; i < 11; i++) {
			g2d.rotate(Math.toRadians(30), 400, 400); 

			g2d.drawArc(cx , cy , width, height, -77, -20);
			}
		
		g2d.rotate
		(Math.toRadians(175), 400, 400); 
		
		g2d.drawArc(cx -50,cy -120, width, height, 41, 27); 
		
		for (int i = 0; i < 11; i++) {
			g2d.rotate(Math.toRadians(30), 400, 400); 

			g2d.drawArc(cx -50,cy -120, width, height, 41, 27);
			}
	}
}
