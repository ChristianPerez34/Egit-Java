import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400, 300);
		mainFrame.setTitle("My first Java GUI with mutable Car Rocks!");
		MyComponent theComponent = new MyComponent();
		mainFrame.add(theComponent);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}