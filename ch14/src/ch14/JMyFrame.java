package ch14;

import javax.swing.*;

public class JMyFrame extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 120;
	
	public JMyFrame()  {
		super("My Frame");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	
	
}
