import java.awt.*;  //for color and Graphis 
import java.awt.geom.*;  //for create shapes and paths 
import javax.swing.*;

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
		r = 350;
		
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
		System.out.println("rad is " + rad); 
		double sinValue = Math.sin(rad);
		System.out.println("sin is " + sinValue);
		double cosValue = Math.cos(rad); 
		System.out.println("cos is " + cosValue); 
		
		double dWidth = r*(cosValue + (rad*sinValue));
		System.out.println("double width is " + dWidth); 
		
		double dHeight = r*(sinValue - (rad*cosValue));
		width = (int)dWidth; 
		height = (int)dHeight; 
		System.out.println("width is " + width);
		System.out.println("height is " + height);
		
		arcLength = (r/2) * rad * rad;
		System.out.println("arcLength is " + arcLength); 
		
		arcAngle = (int) Math.toDegrees(arcLength/r);  
		System.out.println("arcAngle is " + arcAngle); 
		
		//cx = 120;
		// cy = 110;
		cx = (int) (400 + (r* (Math.cos(2.093)))); 
		cy = (int) (400 - (r* (Math.sin(2.093)))); 
		System.out.println("cx is " + cx + " and cy is " + cy);
		
		g.setColor(Color.RED);
		g.drawArc(cx,cy, width,height,0,180); 
		
		//Path2D.Double curve = new Path2D.Double();
		//curve.moveTo(cx,cy);
		//curve.curveTo(200,200,300,350,500,100);
		//g2d.draw(curve);
		
		
		
	}
}
	/**	Path2D.Double p = new Path2D.Double();
		p.moveTo(100,300);
		p.lineTo(150,200);
		p.lineTo(200,300);
		p.closePath();
		g2d.draw(p);
		g2d.fill(p);
	}*/
	
	/**private int width;
	private int height;
	private Cloud c1;
	private Cloud c2;
	private Cloud c3;
	
	public DrawingCanvas(int w, int h) {
		width = w;
		height = h;
		c1 = new Cloud(10,50,75,Color.LIGHT_GRAY);
		c2 = new Cloud(200,75,90,Color.BLUE);
		c3 = new Cloud(420,60,85,Color.DARK_GRAY);
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
		g2d.setColor(new Color(100,149,237));
		g2d.fill(r);
		
		Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
		
		Line2D.Double line = new Line2D.Double(100,250,300,75);
		g2d.setColor(Color.BLACK);
		g2d.draw(line);
		
		Path2D.Double curve = new Path2D.Double();
		curve.moveTo(250,400);
		curve.curveTo(350,300,500,300,600,400);
		g2d.draw(curve);
		
		c1.drawCloud(g2d);
		c2.drawCloud(g2d);
		c3.drawCloud(g2d);
		
	}*/


