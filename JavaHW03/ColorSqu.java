import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ColorSqu extends JFrame {
	private static final int XINT = 40;
	private static final int YINT = 30;
	private static final int NUMOFPOINTS = 20;
	private static final double DELTA = 10.0;
	
	public void paint(Graphics g) {
		int xOld = XINT, yOld = YINT, xNew, yNew;
		double t = 10.0;
		for (int i=0; i< NUMOFPOINTS; i++) {
			if (i%3 == 0)
				g.setColor(Color.RED);
			else if (i%3 == 1)
				g.setColor(Color.GREEN);
			else if (i%3 == 2)
				g.setColor(Color.BLUE);
			xOld = (int)(XINT+ t);
			yOld = (int)(YINT+ t);
			xNew = (int)(XINT+ t);
			yNew = (int)(XINT+ t);
			g.drawRect(xOld,  yOld,  xNew,  yNew);
			t += DELTA;
		}
	}
}
