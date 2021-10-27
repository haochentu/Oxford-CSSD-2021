import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class CircleFac extends JFrame implements ShapeFac {

   @Override

   public void drawCircle(){
		setTitle("Draw Circle");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}

		//make oval into a circle
   public void paint(Graphics g){
		Graphics2D gg = (Graphics2D) g;
		gg.drawOval(200,200,200,200);
		gg.setPaint(Color.red);  //get the red paintbrush
		gg.fillOval(200,200,200,200);  
	}
		
}
