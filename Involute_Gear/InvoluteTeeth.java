import java.awt.*;
import java.awt.geom.*;

public class InvoluteTeeth {
	private int r;
	private int t; 
	private double x1; 
	private double y1;
	private double x2;
	private double y2;
	private double xx;
	private double yy; 
	private int teethNumber; 
	private Color color;
	private Rectangle rec; 

	public InvoluteTeeth(int r, int t, double x1, double y1, double x2, double y2, double xx, double yy, int teethNumber, Color color) {
		this.r = r;
		this.t = t;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2; 
		this.xx = xx;
		this.yy = yy; 
		this.teethNumber = teethNumber; 
		this.color = color; 
	}	
	
	protected void drawInvoluteTeeth(Graphics2D g2d) {
		
		g2d.setColor(color);
		
		for (int i = 0; i < teethNumber; i++) {
			
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
				
				t += 1; 
				
				rad = Math.toRadians(t);  
				sinValue = Math.sin(rad);
				cosValue = Math.cos(rad); 
				
				x2 = r*(cosValue + (rad*sinValue));
				x2 = r + x2; 
				y2 = r*(sinValue - (rad*cosValue)); 
				y2 = r - y2;
				
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
	
	g2d.setColor(Color.black);
	
	g2d.rotate(Math.toRadians(60/teethNumber), 400, 400);
		
	for (int i = 0; i < teethNumber; i++) {
		
		for (int i1 = 0; i1 < 50; i1++) {
			double rad = Math.toRadians(t);  
			double sinValue = Math.sin(t);
			double cosValue = Math.cos(t); 
			
			if (x2 == 0) {
				x1 = -(r*(cosValue + (rad*sinValue)));
				x1 = r - x1; 
				xx = x1; 
			} else {
				x1 = x2; 
			}
			
			if (y2 == 0) {
				y1 = -(r*(sinValue - (rad*cosValue)));
				y1 = r + y1;
				yy = y1; 
			} else {
				y1 = y2; 
			}
			
			t += 1; 
			
			rad = Math.toRadians(t);  
			sinValue = Math.sin(rad);
			cosValue = Math.cos(rad); 
			
			x2 = -(r*(cosValue + (rad*sinValue)));
			x2 = r - x2; 
			y2 = -(r*(sinValue - (rad*cosValue))); 
			y2 = r - y2;
			
			if (t == 1) {
				g2d.rotate(Math.toRadians(-90), (int)xx, (int)yy); 
				//g2d.translate(0,yy); 
				//g2d.scale(1,-1); 
				//g2d.translate(0, -yy);	
			}
			
			//g2d.rotate(Math.toRadians(30), 400, 400);
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
