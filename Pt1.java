import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pt1 {
    public static void main(String[] args) {
        int WIDTH = 800;
        int HEIGHT = 450;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();

        window.setSize(WIDTH, WIDTH);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(new Color(247, 68, 68));
        window.setResizable(false);
        window.add(panel);
    }
}