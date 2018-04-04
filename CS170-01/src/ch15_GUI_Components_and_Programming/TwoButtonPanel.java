package ch15_GUI_Components_and_Programming;

import javax.swing.*;

public class TwoButtonPanel extends JPanel{
	private JButton okButton,
					exitButton;
	
	public TwoButtonPanel() {
		okButton = new JButton("OK");
		add(okButton);
		
		exitButton = new JButton("Exit");
		add(exitButton);
	}
}
