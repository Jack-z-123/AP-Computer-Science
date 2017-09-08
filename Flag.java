import java.awt.*;
import javax.swing.*;
import java.lang.Math;
import java.awt.geom.*;
import java.awt.event.*;

public class Flag extends JFrame {


	private double width;
	private double length;
	private double unionWidth;
	private double unionLength;
	private double E;
	private double F;
	private double G;
	private double H;
	private double starD;
	private double stripeWidth;

	/**
	 * Constructor, instantiates scales.
	 */
	public Flag(){

		setBackground(Color.RED);
		this.width = 500;
		this.length = 1.9 * this.width;
		this.unionWidth = 0.5385 * this.width;
		this.unionLength = 0.76 * this.width;
		this.E = 0.054 * this.width;
		this.F = 0.054 * this.width;
		this.G = 0.063 * this.width;
		this.H = 0.063 * this.width;
		this.starD = 0.0616 * width;
		this.stripeWidth =  this.width/13.0;
		setSize((int)this.length,(int)this.width);

	}

	/**
	 * calls drawStrpes, drawField and starWrapper, and handles resizing
	 * @param g the graphics object
	 */
	public void paint(Graphics g) {
		//draws stripes, field, and stars
		drawStripes(g);
		drawUnion(g);
		addStars(g);
		//updating scales to make sure that the flag is in scale
		updateVars();
		//set to scaled size
		setSize((int)this.length,(int)this.width);

	}
	/**
	 * Updates the variables for scaling when dragging the window.
	 */
	private void updateVars(){
		this.width = 1 * getHeight();
		this.length = 1.9 * this.width;
		this.unionWidth = 0.5385 * this.width;
		this.unionLength = 0.76 * this.width;
		this.E = 0.054 * this.width;
		this.F = 0.054 * this.width;
		this.G = 0.063 * this.width;
		this.H = 0.063 * this.width;
		this.starD = 0.0616 * width;
		this.stripeWidth =  this.width/13.0;


	}
	/**
	 * set a color, draw, and fill the rectangle
	 * @param g the Graphics object to be drew
	 */
	private void drawUnion(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(0, 0, (int)unionLength, (int)unionWidth);	
	}
	/**
	 * Draw the 13 stripes with color red and white in the American flag
	 * @param g the Graphics object to be drew
	 */
	private void drawStripes(Graphics g){
		// for int i = 0, when i is less than 13,i +1 until
		//i is not less than 13
		for (int i = 0; i < 13; i++) {
			//if i can be totally divided by 2
			// g set color to red
			if (i % 2 == 0) {
				g.setColor(Color.RED);

			} 
			//otherwise g set color to white
			else {
				g.setColor(Color.WHITE);
			}
			//fills the rectangle, color depends on the condition of i
			g.fillRect(0, i *(int) this.stripeWidth, (int)this.length, (int)this.stripeWidth);
		}
	}
	/**
	 * Draw a star 
	 * @param g the Graphics object to be drew
	 * @param xoffSet coordinate of where the star is going to be(center,x-axis).
	 * @param yoffSet coordinate of where the star is going to be(center, y-axis).
	 */
	private void drawStars(Graphics g, int xoffSet,int yoffSet){

		// creates 2 arrays of integers that has a size of 10
		//each elements has a value of 0. 
		//(for example, right now xPoints = {0,0,0,0,0,0,0,0,0,0})
		int[] xPoints = new int[10];
		int[] yPoints = new int[10];
		//Like a trig circle, i starts at ∏ (in radians),It rotates 2∏/5(10 points, 2∏/5 is 1/10 of the circle)
		//until it got a full circle(2∏ is 360 in degrees mode, which is a full circle).
		for (double i = Math.PI; i < 3*Math.PI; i+=2*Math.PI/5) {
			int k = 0;
			// The star have 10 points, 
			//5 points on the outer circle, 5 points on	inner circle
			//this finds the 5 outer circle points
			xPoints[k] = (int) (Math.sin(i)*G/2 + xoffSet + this.G);
			//radius of the outer circle
			yPoints[k] = (int) (Math.cos(i)*G/2 + yoffSet);
			k++;
			//this finds the 5 inner circle poitns
			xPoints[k] = (int) (Math.sin(i+Math.PI/5)*G/4 + xoffSet + this.G);
			//radius of the inner circle
			// this.G here is to avoid the first star of the row being out of the window
			yPoints[k] = (int) (Math.cos(i+Math.PI/5)*G/4 + yoffSet );
			k++;
		}

		g.setColor(Color.WHITE);
		//fills the polygon with the 10 points that got from the for loop
		g.fillPolygon(xPoints, yPoints, 10);
	}

	/**
	 * Draw 50 stars to the American flag
	 * @param g the Graphics object to be drew
	 */

	private void addStars(Graphics g){
		//for int j = o, when j is less than or equal to 5, j +1 until
		//j is not less than or equal to 5
		for (int j = 0; j <= 5; j ++){
			for (int i = 0; i <=5;i++){
				//for int i = 0 when i is less than or equal to 5, i +1 until 
				//i is less than or equal to 5
				//use the drawStar methods to draw, this draws 6 stars in the first, third,fith,seventh,ninegth row.
				drawStars(g,(int)(2*this.G * j),(int) (1.75* this.F*i));
				//distance between the 2 stars
				//here they are  2*this.G for left and right
				//1.75* this.F for up and down
			}
		}
		//for int k = 1, when k is less than or equal to 9, k+2 until
		// k is not less than or equal to 9
		for (int k = 1; k <= 9; k +=2){
			//for int l = 2.5, when l is less than or equal to 9, l +2 until
			// l is not less than or equal to 9
			for (double l = 2.5; l <= 9; l +=1.75 ){
				//use the drawStar methods to draw 5 stars in the second, forth,sixth,eighth row.
				drawStars(g,(int)(this.G * k),(int)( l*this.F));
				//distance between the 2 stars
				//here they are  2*this.G for left and right
				//1.75* this.F for up and down
			}

		}

	}



}


