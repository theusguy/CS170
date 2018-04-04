package ch15_GUI_Components_and_Programming;

import java.awt.*;

public class ToolkitTest {
	public static void main(String[] args) {
		//Toolkit constructors must be private, use static method to call on constructor 
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		System.out.println("My screen width: " + d.getWidth());
		System.out.println("My screen height: " + d.getHeight());
		
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Rectangle rec = environment.getMaximumWindowBounds();
		System.out.println("Centered width: " + rec.getCenterX());
		System.out.println("Centered height: " + rec.getCenterY());
		System.out.println("My Screen Dimension: " + rec);
		
		Point point = environment.getCenterPoint();
		System.out.println("Center of Screen: " + point);
		
	}

}
