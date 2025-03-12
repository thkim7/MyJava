import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RectFrame extends JFrame {
	public RectFrame() {
		String nameString = JOptionPane.showInputDialog("이름을 입력하시오.");
		
		setSize(400, 200);
		setTitle("이름 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.YELLOW);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel(nameString +"님, 반갑습니다!");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		label.setForeground(Color.blue);
		cPane.add(label);
	}
}
