import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BouncingCircle extends BouncingFigure {
	private int height;
	private int width;
	

	public BouncingCircle(int xLeft, int yTop, int height, int width, double trajectory, int speed) {
		setXLeft(getXLeft());
		setYTop(getYTop());
		setTrajectory(getTrajectory());
		setSpeed(getSpeed());
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D circle = new Ellipse2D.Double(getXLeft(), getYTop(), (double)height, (double) width);
		g2.setColor(Color.BLUE);
		g2.fill(circle);
		g2.draw(circle);

	}

	@Override
	public boolean rightBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leftBorderCollision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upperBorderCollision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lowerBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		return false;
	}

}
