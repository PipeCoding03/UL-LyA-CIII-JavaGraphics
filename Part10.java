import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part10 extends JFrame {
    int WIDTH = 820;
    int HEIGHT = 900;
    JPanel panel = new JPanel();

    public Part10(){
        setTitle("Gráfico #10");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(new Color(153, 153, 153));
        add(panel);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(new Color(0, 80, 220));

        int Xo = 50, Yo = 800 - 50;
        int Xf = Yo, Yf = Yo;
        int mid = ((Xf - Xo) / 2) + 50;

        g2d.setColor(new Color(120, 0, 250));
        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo + 10 * i, Yo, mid, Yf - 10 * i);
        }

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf - 10 * i, Yo, mid, Yf - 10 * i);
        }

        g2d.setColor(new Color(0, 20, 250));
        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo + 10 * i, Xo, mid, Xo + 10 * i);
        }

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf - 10 * i, Xo, mid, Xo + 10 * i);
        }

        g2d.setColor(new Color(255, 200, 0));
        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo, Xo + 10 * i, Xo + 10 * i, mid);
        }

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo, Yo - 10 * i, Xo + 10 * i, mid);
        }

        g2d.setColor(new Color(0, 220, 50));
        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf, Xo + 10 * i, Xf - 10 * i, mid);
        }

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf, Yo - 10 * i, Xf - 10 * i, mid);
        }
    }
}