import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age1 = JOptionPane.showInputDialog("how old are you");
	int age = Integer.parseInt(age1);
	
	if (age > 18) {
		JOptionPane.showMessageDialog(null, "who do you think the next president should be");
	}
	if (age < 18) {
		JOptionPane.showConfirmDialog(null, "nobody cares about what you think");
	}
}
}
