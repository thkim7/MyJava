import javax.swing.JFrame;

public class ColorSquDemo extends JFrame {
	
	public static void main(String[] args) {
		ColorSqu squ = new ColorSqu();
		squ.setSize(500, 500);
		squ.setTitle("컬러 사각형");
		squ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		squ.setVisible(true);
	}

}
