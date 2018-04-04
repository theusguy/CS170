package ch15_GUI_Components_and_Programming;

import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*;

public class ButtonFrame extends JFrame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	
	public ButtonFrame() {
		setTitle("Example Button Frame");
		setSize(d.width/2, d.height/2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new ButtonPanel();
		this.add(panel);
		
	}
	
	//Programmer-defined to centering a window (frame)
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
	

}
