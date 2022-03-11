package model;

/**
 * This class models out the basic move that a piece can possibly
 * make. This object is created through the various pieces according 
 * to their own respective getPossibleMoves method.
 * 
 * @author carsonchapman
 *
 */
public class Move {
	
	 private int x;
	 private int y;
	 private int color;
	 
	 
	 /**
	  * This is a paramaterized constructor set in place to create the
	  * current possible move. Move takes in 2 integer values for x and y
	  * and assigns the instances of x and y respectively.
	  * 
	  * @param x : pieces x location
	  * @param y : pieces y location
	  */
	 public Move(int x, int y, int color) {
		 this.x = x;
		 this.y = y;
		 this.color = color;
	 }
	 
	 public int getX() { return x; }
	 public int getY() { return y; }
	 public int getColor() {return color; }
}
