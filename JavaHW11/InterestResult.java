import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class InterestResult extends JFrame {
	
	public InterestResult(String msg, String interest) {
		setSize(550, 200);
		setTitle("관심 분야 등록 결과");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("관심 분야를 등록해 주셔서 감사합니다!", SwingConstants.CENTER);
		
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setForeground(Color.blue);
		JLabel msgLabel = new JLabel(msg, SwingConstants.CENTER);
		JLabel interLabel = new JLabel(interest, SwingConstants.CENTER);
		msgLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		interLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.add(label, BorderLayout.NORTH);
		container.add(msgLabel, BorderLayout.CENTER);
		container.add(interLabel, BorderLayout.SOUTH);
	}
}
