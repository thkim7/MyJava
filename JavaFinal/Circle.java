import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JFrame {
	
	public Circle() {
		setSize(400, 400);
		setTitle("화살표키로 원 이동하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		JButton button = new JButton("Go");
		button.addActionListener(new ButtonListener());
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());

		cPane.add(button);
    }
	
	public static final int NUM = 10;
	private JButton[] list;
	private int index;
	
	private class MyPanel extends JPanel{
		public MyPanel() {
			setLayout{new GridLayout(0, NUM));
			list = new JButton[NUM * NUM];
			for (int i = 0; i<list.length; i++) {
				list[i] = new JButton();
				list[i].setBackground(Color.white);
				list[i].setEnabled(false);
				add(list[i]);
			}
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(0, 0, 255));
		g.fillOval(175, 175, 50, 50);
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
	
	public static void main(String[] args) {
		(new Circle()).setVisible(true);
	}
}
