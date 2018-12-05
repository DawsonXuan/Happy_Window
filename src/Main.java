import java.awt.*;
public class Main {
	public static void main(String[] args) {
		Window window = new Window();
		window.setVisible(true);
		
		for(int i = 0; i<Integer.MAX_VALUE; i++) {
			System.out.println("it's happy time");
			//i have no idea what i'm doing
			new Window() {
				{
					this.setLocation(MouseInfo.getPointerInfo().getLocation().x -10, MouseInfo.getPointerInfo().getLocation().y-10);
				}
			}.setVisible(true);
			try {
				Thread.sleep(20);
			} catch(Exception e) {
				
			}
			
		}
	}
}

