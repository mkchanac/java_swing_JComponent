package ch14;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxDemonstration extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel label = new JLabel("What would you like to drink?");
	JCheckBox coffee = new JCheckBox("Coffee", false);
	JCheckBox cola = new JCheckBox("Cola", false);
	JCheckBox milk = new JCheckBox("Milk", false);
	JCheckBox water = new JCheckBox("Water", false);
	
	public CheckBoxDemonstration() {
		super("CheckBox Demonstration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		label.setFont(new Font("Arial",Font.ITALIC,22));
		coffee.addItemListener(this);
		cola.addItemListener(this);
		milk.addItemListener(this);
		water.addItemListener(this);
		add(label);
		add(coffee);
		add(cola);
		add(milk);
		add(water);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		CheckBoxDemonstration frame = new CheckBoxDemonstration();
		frame.setSize(350,120);
		frame.setVisible(true);
	}
	
	
	
	
	
	
}
