import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	static int counter = 0;
	
	public void paintComponent(Graphics g){
		Rectangle r = new Rectangle(0,0,50,50);
		Rectangle r2 = new Rectangle(this.getWidth()-50, this.getHeight()-50, 50, 50);
		//Rectangle r2 = new Rectangle(350, 250, 50, 50);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(r);
		g2.draw(r2);
		System.out.println("Painted " + counter++ + " times");
	}

}
