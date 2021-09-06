package ch14;

import javax.swing.*;
import java.awt.*;

public class JFrame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;
		Font headlineFont = new Font("Arial", Font.BOLD, 36);
		JFrame aFrame = new JFrame("Fourth Frame");
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel greeting = new JLabel("Good day");
		greeting.setFont(headlineFont);
		aFrame.add(greeting);
	}

}
