package ch14;

import javax.swing.*;

public class JDemoFramethatCloses {
	public static void main(String[] args) {
		 JFrame aFrame = new JFrame("This is a frame");
	     final int WIDTH = 300;
	     final int HEIGHT = 250;
	     aFrame.setSize(WIDTH, HEIGHT);
	     aFrame.setVisible(true);
	     aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
