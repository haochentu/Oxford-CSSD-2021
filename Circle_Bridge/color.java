//color interface

package design.bridge; 
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public interface color{
	public void fill(Graphics g, int x, int y, int xx, int yy);
}
