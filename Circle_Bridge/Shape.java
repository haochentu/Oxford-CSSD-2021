// abstract shape class with a reference to color interface

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public abstract class Shape extends JFrame{
	protected color color;
	
	protected Shape(color color){
		this.color = color;
	}
	
	public abstract void draw();
}
