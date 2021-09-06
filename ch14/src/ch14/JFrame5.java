package ch14;

import javax.swing.*;
import java.awt.*;

public class JFrame5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;

		JFrame aFrame = new JFrame("Fifth Frame");
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel greeting = new JLabel("Hello");
		JLabel greeting1 = new JLabel("Who are you?");
		aFrame.setLayout(new FlowLayout());
		aFrame.add(greeting);
		aFrame.add(greeting1);
	}

}
