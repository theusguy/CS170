package ch15_GUI_Components_and_Programming;

import javax.swing.*;

public class ButtonPanel extends JPanel{
	private JButton myButton;
	
	public ButtonPanel() {
		myButton = new JButton("My button");
		this.add(myButton);
	}
}
