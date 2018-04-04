package ch15_GUI_Components_and_Programming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoButtonPanel12 extends JPanel implements ActionListener{
	private JButton okButton, exitButton;
	public TwoButtonPanel12() {
		okButton = new JButton("OK");
		exitButton = new JButton("Exit");
		add(okButton);
		add(exitButton);
		//Add ActionListener event handling capabilities to each button
		okButton.addActionListener(this);
		okButton.addActionListener(this);
	}
	
	//Implement method to handle event
	public void actionPerformed(ActionEvent e) {
		//Obtain source of triggered event
		Object source = e.getSource();
		if (source == okButton) {
			JOptionPane.showMessageDialog(null, "Ok button is pressed...");
		} else if (source == exitButton) {
			JOptionPane.showMessageDialog(null, "Goodbye!\nPress Exit to close window...");
			System.exit(0);
		}
	}
}
