import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PeterAlert {

	private static final ImageIcon PETER_IMAGE = new ImageIcon(PeterAlert.class.getResource("peter.png"));

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "", "Peter Alert", JOptionPane.INFORMATION_MESSAGE, PETER_IMAGE);
		System.out.println("Nyeheheh hey Lois remember that time I was a Java application? Frickin' schweet.");
	}
}