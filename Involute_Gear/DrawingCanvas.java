import java.awt.*;  //for color and Graphis 
import java.awt.geom.*;  //for create shapes and paths 
import javax.swing.*;

public class DrawingCanvas extends JComponent {
	public DrawingCanvas() {
		
	}
	
	int xCenter;
	int yCenter;
	int r;
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		xCenter = 400;
		yCenter = 400;
		r = 300;
		
		Ellipse2D.Double e = new Ellipse2D.Double(xCenter-r, yCenter-r, 2*r, 2*r);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
		
		xCenter = 400;
		yCenter = 400;
		r = 200;
		
		Ellipse2D.Double e2 = new Ellipse2D.Double(xCenter-r, yCenter-r, 2*r, 2*r);
		g2d.setColor(Color.GRAY);
		g2d.fill(e2);
		
	}
}
