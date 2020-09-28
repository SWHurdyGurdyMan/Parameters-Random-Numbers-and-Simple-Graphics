//Coded by: Shelby Walles
/*This program allows the user to draw lines with their mouse
by creating a line start point when the left mouse button is pressed
and creating an end point when it it released*/

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.event.*;
public class DrawingLines extends GraphicsProgram {
	//creates GLine named Line, allows use of Line in multiple methods
	public GLine Line;
	public void run() {
		//addMouseListeners,such as mousePressed, mouseDragged, and mouseReleased
		addMouseListeners();
	}
	//activates when mouse button is pressed down, creates and sets start point of line
	public void mousePressed(MouseEvent click) {
		Line = new GLine(click.getX(),click.getY(), click.getX(),click.getY());
		add(Line);
	}
	//calls when mouse button is held down and mouse is moved, sets end point of line
	public void mouseDragged(MouseEvent click) {
		Line.setEndPoint(click.getX(),click.getY());
	}
}