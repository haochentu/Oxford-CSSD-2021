import java.awt.*;
import java.awt.geom.*;

public class InvoluteTeeth {
	private int cx;
	private int cy;
	private int r;
	private int t; 
	private int teethNumber; 
	private Color color; 

	public InvoluteTeeth(int cx, int cy, int r, int t, int teethNumber, Color color) {
		this.cx = cx;
		this.cy = cy;
		this.r = r;
		this.t = t;
		this.teethNumber = teethNumber; 
		this.color = color; 
	}	
	
	public void drawInvoluteTeeth(Graphics2D g2d) {
		g2d.setColor(color);
		
		double rad = Math.toRadians(t);  
		double sinValue = Math.sin(rad);
		double cosValue = Math.cos(rad); 
		
		double dWidth = r*(cosValue + (rad*sinValue));
		double dHeight = r*(sinValue - (rad*cosValue));
		int width = (int)dWidth; 
		int height = (int)dHeight; 
		
		cy = cy - (height/4); 
		
		g2d.drawArc(cx ,cy, width, height, -19, -36); 
		
		for (int i = 0; i < teethNumber - 1; i++) {
			g2d.rotate(Math.toRadians(360/teethNumber), 400, 400); 
			g2d.drawArc(cx , cy, width, height, -19, -36);
			}
		
		g2d.rotate(Math.toRadians(0), 400, 400); 
		
		g2d.drawArc(cx,cy, width, height, 19, 36); 
		
		for (int i = 0; i < teethNumber -1; i++) {
			g2d.rotate(Math.toRadians(360/teethNumber), 400, 400); 
			g2d.drawArc(cx ,cy, width, height, 19, 36);
			}
	}
}
