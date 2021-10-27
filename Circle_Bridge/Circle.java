//circle class 

public circle extends Shape{
	/**public drawCircle(){
		setTitle("Draw Circle");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}*/
	
	private Graphics g, int a, b, c, d; 
	//make oval into a circle
	public cicle(Graphics g, int a, int b, int c, int d, color color){
		super(color);
		Graphics2D gg = (Graphics2D) g;
		gg.drawOval(a, b, c, d); //drawOval is a Java method in Graphics. 
		// the parameters pass are drawOval(int x, int y, int width, int height)
		// by changing the number in parameters we can control the size of the circle
		// the resource to understand drawOval(): https://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html

	}
	
	public static void draw() {
		color.fill(Graphics g,200,200,200,200);
	
	}
}
