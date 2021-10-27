//circle class 

public circle extends Shape{
	public drawCircle(){
		setTitle("Draw Circle");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	//make oval into a circle
	public void paint(Graphics g){
		Graphics2D gg = (Graphics2D) g;
		gg.drawOval(200,200,200,200); //drawOval is a Java method in Graphics. 
		// the parameters pass are drawOval(int x, int y, int width, int height)
		// by changing the number in parameters we can control the size of the circle
		// the resource to understand drawOval(): https://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html
		gg.setPaint(Color.red);  //get the red paintbrush
		gg.fillOval(200,200,200,200);  //paint red in the dimension I set which is the same coordination as my circle. 
		// the resource to understand color: https://www.tabnine.com/code/java/methods/java.awt.Graphics/fillOval
	
		
	}
	
	public static void main(String[] args) {
		new drawCircle();
	
	}
}
