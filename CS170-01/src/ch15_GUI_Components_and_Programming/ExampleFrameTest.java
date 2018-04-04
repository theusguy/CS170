package ch15_GUI_Components_and_Programming;

import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class ExampleFrameTest {
	public static void main(String[] args) {
		//Make the frame
		JFrame frame = new ExampleFrame();
		//Make it visible. Let there be light.
		frame.setVisible(true);
	}
}

class ExampleFrame extends JFrame {
	//Setting up Toolkit to get screen size info and store as Dimension object
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	
	//Setting up constructor and various attributes of ExampleFrame
	public ExampleFrame() {
		setTitle("Example Frame");
		setSize(d.width/2, d.height/2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		
		setResizable(false);
	}
	
	//Just a private method used specifically in this class
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
	
}

