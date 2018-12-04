
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	
	private JButton button;
	
	public Window() {
		super("Happy Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(new FlowLayout());
		
		button = new JButton("Interesting Button");
		add(button);
	}
}
