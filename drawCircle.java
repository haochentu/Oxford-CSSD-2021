import javax.swing.*;
import java.awt.*;

public class drawCircle extends JFrame{

	public drawCircle(){
		setTitle("Draw Circle");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//make oval into a circle
	public void paint(Graphics g){
		Graphics2D g2g = (Graphics2D) g;
		g2g.drawOval(200,200,200,200); //drawOval is a Java method in Graphics. 
		// the parameters pass are drawOval(int x, int y, int width, int height)
		// by changing the number in parameters we can control the size of the circle
		// the source to understand drawOval(): https://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html
	}
	
	public static void main(String[] args) {
		new drawCircle();
	
	}
}


//my resource to learn draw circles: https://www.delftstack.com/howto/java/draw-a-circle-in-java/	
