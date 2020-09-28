import acm.graphics.*;
import acm.program.*;
import acm.util.*;
public class RandomCircles extends GraphicsProgram {
	//constants for number of circles and min/max circle radius
	private static final int NUMBER_OF_CIRCLES = 10;
	private static final int MIN_CIRCLE_RADIUS =  5;
	private static final int MAX_CIRCLE_RADIUS =  50;
	public void run() {
		for(int i = 0; i < NUMBER_OF_CIRCLES; i++) {
			circleMaker();
		}
	}
	public void circleMaker() {
		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		RandomGenerator rgen = RandomGenerator.getInstance();
		double circleRadius = rgen.nextDouble(MIN_CIRCLE_RADIUS, MAX_CIRCLE_RADIUS);
		double circlePositionX = rgen.nextDouble(canvasWidth/2, canvasHeight/2);
		double circlePositionY = rgen.nextDouble(canvasWidth/2, canvasHeight/2);
		GOval newCircle = new GOval(circlePositionX, circlePositionY, circleRadius * 2, circleRadius * 2);
		newCircle.setFilled(true);
		newCircle.setFillColor(rgen.nextColor());
		add(newCircle);
	}
}
