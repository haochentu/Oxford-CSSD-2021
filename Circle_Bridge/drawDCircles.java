import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class drawDifferentCircles extends JFrame{
	public drawCircle(){
		setTitle("Draw Circle");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	public static void main(String[] args{
		new drawCircle();
		Shape redCircle = new Circle(200,200,200,200, new red());
		red.draw();
		
	}
}
