package ch14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JAction extends JFrame implements ActionListener {
	JLabel label = new JLabel("Name?");
	JTextField field = new JTextField(12);
	JButton button = new JButton("OK");
	
	public JAction() {
		super("Frame with Components to Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(label);
		add(field);
		add(button);
		button.addActionListener(this);
		field.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText("Thank you so much!");
		button.setText("Application Done");
		
	}
	
	public static void main(String[] args) {
		JAction aFrame = new JAction();
		aFrame.setSize(250,150);
		aFrame.setVisible(true);
	}
	
	
	
}
