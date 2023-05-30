import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args){
        int WIDTH = 800;
        int HEIGHT = 450;
        int BUTTON_WIDTH = 100;
        int BUTTON_HEIGHT = 40;
        int BORDER = 40;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();
        JButton pt1_button = new JButton("Gráfico #1");

        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        panel.setLayout(null);
        window.getContentPane().add(panel);
        panel.setBackground(new Color(247, 68, 68));
        pt1_button.setBounds(BORDER, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
        panel.add(pt1_button);

        pt1_button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HELLO");
                Part1 pt1 = new Part1();
            }
            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
    }
}