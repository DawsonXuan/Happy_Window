
import java.awt.Toolkit;

import javax.swing.*;

public class Window extends JFrame {
	public Window() {
		super("Happy Window");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
	}
}
