import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part6 extends JFrame {
    int WIDTH = 1500;
    int HEIGHT = 1500;
    JPanel panel = new JPanel();

    public Part6() {
        setTitle("Gráfico #6");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(new Color(153, 153, 153));
        add(panel);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(new Color(0, 80, 220));

        int Xo = 670, Yo = 670;
        int Xf = 30, Yf = 670;
        int space = (Xo - Xf) / 29;

        for (int i = 0; i < 29; i++){
            g2d.drawLine(Xo, Yo, Xf + space * i, Yf - space * i);
            g2d.drawLine(Xo, Yo, 1310 + space * i, Yf - space * i);

        }
        for (int i = 0; i < 29; i++){
            g2d.setColor(new Color(220, 0, 80));
            g2d.drawLine(Xo, Yo, 1310 + space * i, Yf - space * i);

        }
    }
}
