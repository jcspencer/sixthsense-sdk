import javax.swing.JFrame;
import javax.swing.JLabel;

public class SDK {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Sixthsense SDK");
    final JLabel label = new JLabel("This Is The Current SDK, Pretty Sad, But More Is Coming :)");
    frame.getContentPane().add(label);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}