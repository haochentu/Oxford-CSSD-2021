import javax.swing.*;
import java.awt.*;

public class drawCircle extends JFrame{

	public drawCircle(){
		setTitle("Draw Circle");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//override to make oval into a circle
	public void paint(Graphics g){
		Graphics2D g2g = (Graphics2D) g;
		g2g.drawOval(150,150,100,100);
	}
	
	public static void main(String[] args) {
		new drawCircle();
	
	}
}


//my resource to learn draw circles: https://www.delftstack.com/howto/java/draw-a-circle-in-java/	
