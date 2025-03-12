import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JFrame{
	
	private class MyPanel extends JPanel{
		private Point[] points;
		private int count = 0;
		
		public MyPanel() {
			points = new Point[20];
			
			this.addMouseListener(new MouseListener() {
				public void mousePressed(MouseEvent e) {
					if (count < points.length) {
						points[count++] = new Point(e.getX(), e.getY());
						repaint();
					}
				}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			for (int i = 0; i < count; i++) {
				if (i%3 == 0)
					g2.setColor(Color.red);
				else if (i%3 == 1)
					g2.setColor(Color.green);
				else if (i%3 == 2)
					g2.setColor(Color.blue);
				g2.fillOval(points[i].x-25, points[i].y-25, 50, 50);
			}
				
		}
	}
	
	public Circle() {
		setSize(400, 400);
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	public static void main(String[] args) {
		(new Circle()).setVisible(true);
	}
}