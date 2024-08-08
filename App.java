import javax.swing.*;

public class App {

	public static void main(String[] args) {

		int BoardWidth = 360;
		int BoardHeight = 640;
		
		JFrame frame = new JFrame("");

		frame.setSize(BoardWidth, BoardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlappyBird flappybird = new FlappyBird();
		frame.add(flappybird);
		frame.pack();
		frame.setVisible(true);
	}

}
