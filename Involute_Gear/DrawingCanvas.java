import java.awt.*;  //for color and Graphis 
import java.awt.geom.*;  //for create shapes and paths 
import javax.swing.*;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class DrawingCanvas extends JComponent {
	public DrawingCanvas() {
		
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
		
		xCenter = 400;
		yCenter = 400;
		r = 240;
		
		Ellipse2D.Double e = new Ellipse2D.Double(xCenter-r, yCenter-r, 2*r, 2*r);
		g2d.setColor(Color.YELLOW);
		g2d.fill(e);
		
		xCenter = 400;
		yCenter = 400;
		r = 200;
		
		Ellipse2D.Double e2 = new Ellipse2D.Double(xCenter-r, yCenter-r, 2*r, 2*r);
		g2d.setColor(Color.GRAY);
		g2d.fill(e2);
		
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
		
		for (int i = 0; i < 5; i++) {
			g2d.rotate(Math.toRadians(60), 400, 400); 

			g2d.drawArc(cx , cy , width, height, -77, -20);
			}
		
		g2d.rotate(Math.toRadians(175), 400, 400); 
		
		g2d.drawArc(cx -50,cy -130, width, height, 44, 27); 
		
		for (int i = 0; i < 5; i++) {
			g2d.rotate(Math.toRadians(60), 400, 400); 

			g2d.drawArc(cx -50,cy -130, width, height, 44, 27);
			}
		

		Ellipse2D.Double e3 = new Ellipse2D.Double(xCenter-r, yCenter-r, 2*r, 2*r);
		g2d.setColor(Color.GRAY);
		g2d.fill(e3);
	}
	
}
