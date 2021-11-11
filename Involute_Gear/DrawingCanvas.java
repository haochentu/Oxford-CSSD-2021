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
	
	public DrawingCanvas(int w, int h, int r) {   
		c1 = new Circle(400, 400, 302, Color.PINK);   //call Circle class
		c2 = new Circle(400, 400, r, Color.YELLOW);
		
		//it1 = new InvoluteTeeth(400, 400, 200, 80, 12, Color.RED); //call InvoluteTeeth class, 
	    //here user can define the number of teeth they want, the maximum is 12 within the setting here. 
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
				
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		//c1.drawCircle(g2d);  //call drawCircle metSystem.out.println("x1 is " + x1); hod
		c2.drawCircle(g2d);
		
		//it1.drawInvoluteTeeth(g2d); //call InvoluteTeeth method 
		
		int r = 200; 
		int t = 0; 
		double x1; 
		double y1; 
		double x2 = 0; 
		double y2 = 0; 	
		int teethNumber = 6; 
		double x0 = 0; 
		double xx = 0; 
		double yy = 0; 
		
		g2d.setColor(Color.BLUE);
		
		for (int i = 0; i < 6; i++) {
			
			for (int i1 = 0; i1 < 50; i1++) {
				double rad = Math.toRadians(t);  
				double sinValue = Math.sin(t);
				double cosValue = Math.cos(t); 
				
				if (x2 == 0) {
					x1 = r*(cosValue + (rad*sinValue));
					x1 = r + x1; 
					xx = x1; 
				} else {
					x1 = x2; 
				}
				
				if (y2 == 0) {
					y1 = r*(sinValue - (rad*cosValue));
					y1 = r + y1;
					yy = y1; 
				} else {
					y1 = y2; 
				}
				
				
				//System.out.println("x1 is " + x1); 
				t += 1; 
				
				rad = Math.toRadians(t);  
				sinValue = Math.sin(rad);
				cosValue = Math.cos(rad); 
				
				x2 = r*(cosValue + (rad*sinValue));
				x2 = r + x2; 
				//System.out.println("x0 is " + x0);
				y2 = r*(sinValue - (rad*cosValue)); 
				y2 = r - y2;
				//System.out.println("x2 is " + x2);
				
				if (t == 1) {
					g2d.rotate(Math.toRadians(-90), (int)xx, (int)yy); 
				}
				
				
				g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				
				
			}
			
			x2 = 0;
			y2 = 0;
			t = 0; 

			g2d.rotate(Math.toRadians(90), (int)xx, (int)yy);
			g2d.rotate(Math.toRadians(360/teethNumber), 400, 400);
		}
	}
}
