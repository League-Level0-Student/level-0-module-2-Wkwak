import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("how tall are you in inches?");
		int truheight = Integer.parseInt(height);
		if (truheight > 48) {
			JOptionPane.showMessageDialog(null, "You can go ahead");
		}
		if (truheight <= 48) {
			JOptionPane.showMessageDialog(null, "You have to grow more first");
		}
}
}
