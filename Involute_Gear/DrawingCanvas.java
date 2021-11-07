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
		
		g2d.setColor(Color.BLUE);
		
		for (int i = 0; i < 6; i++) {
			
			for (int i1 = 0; i1 < 50; i1++) {
				double rad = Math.toRadians(t);  
				double sinValue = Math.sin(rad);
				double cosValue = Math.cos(rad); 
				
				if (x2 == 0) {
					x1 = r*(cosValue + (rad*sinValue));
					System.out.println("x1 is " + x1);
				} else {
					x1 = x2; 
				}
				
				if (y2 == 0) {
					y1 = r*(sinValue - (rad*cosValue));
					y1 = r + y1;
				} else {
					y1 = y2; 
				}
				
				//x1 = r*(cosValue + (rad*sinValue));
				System.out.println("x1 is " + x1); 
				
				//y1 = r*(sinValue - (rad*cosValue));
				//y1 = r + y1; 
				
				System.out.println("y1 is " + y1); 
				t += 1; 
				
				x2 = r*(cosValue + (rad*sinValue));
				System.out.println("x2 is " + x2); 
				y2 = r*(sinValue - (rad*cosValue));
				//double y0 = y2+r - y1; 
				//y2 = y1 - y0; 
				y2 = r + y2;
				System.out.println("y2 is " + y2); 
				
				g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				}

			t = 0; 
			g2d.rotate(Math.toRadians(360/6), 400, 400);
		}
	}
}

