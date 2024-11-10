
import java.util.Random;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class PeterAlert_popups {

    private static final ImageIcon PETER_IMAGE = new ImageIcon(PeterAlert_popups.class.getResource("peter.png"));

    public static void main(String[] args) {
        while (true) {
            Thread one = new Thread() {
                public void run() {
                    showPeterAlert();
                    System.exit(0);
                }
            };

            one.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void showPeterAlert() {
        JOptionPane optionPane = new JOptionPane("", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, PETER_IMAGE);
        JDialog dialog = optionPane.createDialog(null, "Peter Alert");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Random random = new Random();
        int x = random.nextInt(screenSize.width - 200);
        int y = random.nextInt(screenSize.height - 400);
        dialog.setLocation(x, y);
        dialog.setVisible(true);
    }
}
