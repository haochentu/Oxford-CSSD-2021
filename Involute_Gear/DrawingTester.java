import javax.swing.JFrame;
import javax.swing.*;

public class DrawingTester {
	public static void main(String[] args) {
		int w = 800;
		int h = 800;
		int r = 200; 
		int teethNumber = 12; 
		int circleDiameter = 400;
		JFrame f = new JFrame();
		DrawingCanvas dc = new DrawingCanvas(w, h, r, teethNumber, circleDiameter);
		
		f.setSize(w,h);
		f.setTitle("Involute Gear");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
