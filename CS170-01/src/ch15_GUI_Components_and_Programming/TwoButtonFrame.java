package ch15_GUI_Components_and_Programming;

import java.awt.*;
import javax.swing.*;

public class TwoButtonFrame extends JFrame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	
	public TwoButtonFrame() {
		setTitle("Two Button Frame");
		setSize(d.width/2, d.height/2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new TwoButtonPanel12();
		add(panel);
	}
	
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//Compute center width
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//Compute center height
		setLocation(centeredWidth, centeredHeight);	
	}

}
