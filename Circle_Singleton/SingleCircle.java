import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class SingleCircle extends JFrame {
	private static SingleCircle instance = new SingleCircle();
	
	private SingleCircle() {}
	
	public static SingleCircle getInstance() {
		return instance;
	}
	
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
