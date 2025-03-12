import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberList extends JFrame {
	private ArrayList<Member> memberlist;
	private JTextField name, age;
	private JTextArea msgArea;
	
	public MemberList() {
		setSize(230, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MemberList");
		
		memberlist = new ArrayList<>();
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		add(new JLabel("이름"));
		name = new JTextField(15);
		add(name);
		add(new JLabel("나이"));
		age = new JTextField(15);
		add(age);
		JButton register = new JButton("등록");
		add(register);
		JButton sort = new JButton("정렬");
		add(sort);
		msgArea = new JTextArea(5, 18);
		msgArea.setEditable(false);
		add(msgArea);
		
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = "";
				memberlist.add(new Member(name.getText().trim(), age.getText().trim()));
				
				for (Member b : memberlist)
					result += b.toString() + "\n";
				
				msgArea.setText(result);
				name.setText("");
				age.setText("");
			}
		});
		
		sort.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.sort(memberlist);
				
			}
		});
	}
	public static void main(String[] args) {
		(new MemberList()).setVisible(true);
	}
}
