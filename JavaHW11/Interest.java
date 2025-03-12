import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Interest extends JFrame {
	
	private JButton btnGo;
	private JTextField inputName;
	private JCheckBox Int1;
	private JCheckBox Int2;
	private JCheckBox Int3;
		
	public Interest() {
		setTitle("관심 분야 등록");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		JLabel label = new JLabel("이름과 관심분야를 등록하세요.", SwingConstants.CENTER);
		
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setForeground(Color.blue);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setLayout(new GridLayout(0,1));
		panel3.setLayout(new GridLayout(0,5));
		CheckBoxListener listener = new CheckBoxListener();
		
		JLabel labelName = new JLabel("이름", JLabel.CENTER);
		
		inputName = new JTextField(35);
		
		JLabel labelSub = new JLabel("관심 분야 : ", JLabel.CENTER);
		Int1 = new JCheckBox("IT", false);
		Int2 = new JCheckBox("외국어", false);
		Int3 = new JCheckBox("여행", false);
		btnGo = new JButton("GO");
		btnGo.addActionListener(listener);
					
		panel1.add(label);
		panel1.add(new JLabel());
		panel2.add(labelName);
		panel2.add(inputName);
		panel3.add(labelSub);
		panel3.add(Int1);
		panel3.add(Int2);
		panel3.add(Int3);
		panel3.add(btnGo);
		panel1.add(panel2);
		panel1.add(panel3);
		add(panel1);
		
		pack();
	}
		
	public class CheckBoxListener implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnGo) {
				String name = inputName.getText();
				String int1 = Int1.getText();
				int i1Check = Int1.isSelected()? 1 : 0;
				String int2 = Int2.getText();
				int i2Check = Int2.isSelected()? 1 : 0;
				String int3 = Int3.getText();
				int i3Check = Int3.isSelected()? 1 : 0;
				if(i1Check == 1 && i2Check == 0 && i3Check == 0) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int1;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();	
				}
				else if(i1Check == 0 && i2Check == 1 && i3Check == 0) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int2;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
				else if(i1Check == 0 && i2Check == 0 && i3Check == 1) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int3;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
				else if(i1Check == 1 && i2Check == 1 && i3Check == 0) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int1 + ", " + int2;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
				else if(i1Check == 1 && i2Check == 0 && i3Check == 1) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int1 + ", " + int3;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
				else if(i1Check == 0 && i2Check == 1 && i3Check == 1) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int2 + ", " + int3;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
				else if(i1Check == 1 && i2Check == 1 && i3Check == 1) {
					String msg = "이름: " + name;
					String interest = "관심분야: " + int1 + ", " + int2 + ", " + int3;
					(new InterestResult(msg, interest)).setVisible(true);
					dispose();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		(new Interest()).setVisible(true);
    }
}

