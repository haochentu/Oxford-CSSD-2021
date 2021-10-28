import javax.swing.JFrame;
import javax.swing.*;

public class DrawingTester {
	public static void main(String[] args) {
		int w = 800;
		int h = 800;
		JFrame f = new JFrame();
		//DrawingCanvas dc = new DrawingCanvas(w,h);
		DrawingCanvas dc = new DrawingCanvas();
		
		f.setSize(w,h);
		f.setTitle("Drawing in Java");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
