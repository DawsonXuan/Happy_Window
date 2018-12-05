
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Window extends JFrame {
	
	private JButton button;
	
	public Window() {
		super("Happy Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(new FlowLayout());
		
		button = new JButton("Interesting Button");
		button.setBackground(new Color( 25, 118, 210));
		button.setBorder(null);
		add(button);
	}
}
