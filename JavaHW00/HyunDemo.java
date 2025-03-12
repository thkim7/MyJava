import javax.swing.JFrame;

public class HyunDemo {

	public static void main(String[] args) {
		Hyun hyun = new Hyun();
		hyun.setTitle("이름 한 글자 쓰기");
		hyun.setSize(300, 300);
		hyun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hyun.setVisible(true);
	}

}
