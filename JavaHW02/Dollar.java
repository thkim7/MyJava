import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Dollar {

	public static void main(String[] args) {
		String dollarString = JOptionPane.showInputDialog("달러 액수: ");
		int dollar = Integer.parseInt(dollarString);
		
		String rateString = JOptionPane.showInputDialog("환율: ");
		int rate = Integer.parseInt(rateString);
		
		
		int won = dollar * rate;
		JOptionPane.showMessageDialog(null, "$" +dollar+"는 " + won +"원입니다." );
		System.exit(0);
	}

}
