//concrete class for color red
public class red implements color{
	public void fill(Graphics g,int x,int y,int xx, int yy){
		x = 200;
		y = 200;
		xx = 200;
		yy = 200;
		Graphics2D gg = (Graphics2D) g;
		gg.setPaint(Color.red);  //get the red paintbrush
		gg.fillOval(x,y,xx,yy);  //paint red in the dimension I set which is the same coordination as my circle. 
}
