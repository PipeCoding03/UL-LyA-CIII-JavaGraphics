import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        int WIDTH = 800;
        int HEIGHT = 450;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();

        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(new Color(247, 68, 68));
        window.add(panel);
    }
}