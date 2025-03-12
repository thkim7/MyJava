import java.awt.Graphics;

import javax.swing.JFrame;

public class Hyun extends JFrame {
	public void paint(Graphics g) {
		g.drawLine(80, 50, 160, 65);
		g.drawLine(70, 90, 170, 90);
		g.drawOval(90, 110, 60, 90);
		g.drawLine(150, 140, 210, 140);
		g.drawLine(150, 180, 210, 180);
		g.drawLine(210, 90, 210, 220);
		g.drawLine(110, 230, 110, 260);
		g.drawLine(110, 260, 220, 260);
	}
}
