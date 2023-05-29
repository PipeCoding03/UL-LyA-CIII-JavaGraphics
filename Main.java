import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        int WIDTH = 800;
        int HEIGHT = 450;

        JFrame window = new JFrame("Java Graphics");
        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}