package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		int lottery1 = rand.nextInt(100);
		int lottery2 = rand.nextInt(100);
		int lottery3 = rand.nextInt(100);
		int lottery4 = rand.nextInt(100);
		int lottery5 = rand.nextInt(100);
		
		JOptionPane.showMessageDialog(null, lottery1 + ", " + lottery2 + ", "+ lottery3 + ", "+ lottery4 + ", "+ lottery5);
	}
}
