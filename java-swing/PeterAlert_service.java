import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PeterAlert_service {

	private static final double MINUTES = 5;

	private static final ImageIcon PETER_IMAGE = new ImageIcon(PeterAlert_service.class.getResource("peter.png"));

	public static void main(String[] args) {
		while (true) {
			try {
				Thread.sleep(10000);
				if (Math.random() < (double) 1 / (MINUTES * 6)) {
					JOptionPane.showMessageDialog(null, "", "Peter Alert", JOptionPane.INFORMATION_MESSAGE,
							PETER_IMAGE);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}