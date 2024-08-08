import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel{
	int BoardWidth = 360;
	int BoardHeight = 640;
	
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

	
	FlappyBird() {
		setPreferredSize(new Dimension(BoardWidth, BoardHeight));
		setBackground(Color.blue);	
		
		backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void draw(Graphics g) {
		
	}
}
