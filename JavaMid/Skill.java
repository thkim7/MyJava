import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Skill extends JFrame {
	public Skill() {
		setSize(600, 400);
		setTitle("프로그래밍 스킬 등록");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(600, 100));
		panel1.setBackground(Color.GREEN);
		JLabel label1 = new JLabel("이름:");
		JTextField field1 = new JTextField(15);
		field1.setText("");
		panel1.add(label1);
		panel1.add(field1);
		
		JPanel panel2 = new JPanel();
		panel1.setPreferredSize(new Dimension(600, 100));
		JLabel label2 = new JLabel("전공:");
		JRadioButton rb1 = new JRadioButton("소프트웨어");
		JRadioButton rb2 = new JRadioButton("가상현실", true);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		panel2.add(rb1);
		panel2.add(rb2);
		
		JPanel panel3 = new JPanel();
		panel1.setPreferredSize(new Dimension(600, 100));
		JLabel label3 = new JLabel("프로그래밍 스킬:");
		panel3.add(new JCheckBox("Python", true));
		panel3.add(new JCheckBox("C", true));
		panel3.add(new JCheckBox("Java Script", true));
		panel3.add(new JCheckBox("C++", true));
		panel3.add(new JCheckBox("Java C#", true));
		
		JPanel panel4= new JPanel();
		panel1.setPreferredSize(new Dimension(600, 100));
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.add(panel1);
		cPane.add(panel2);
		cPane.add(panel3);
		cPane.add(panel4);
		cPane.add(btn1);
		cPane.add(btn2);
		pack();
	}
	
}
