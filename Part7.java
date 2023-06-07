import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part7 extends JFrame {
    int WIDTH = 700;
    int HEIGHT = 720;
    JPanel panel = new JPanel();

    public Part7(){
        setTitle("Gráfico #7");
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

        int Xo = 700 / 2, Yo = 700 / 2;
        int Xf = 30, Yf = 700 / 2;
        int space = (Xo - Xf) / 29;

        for (int i = 0; i < 29; i++){
            g2d.drawLine(Xo, Yo, Xf + space * i, Yf - space * i);
        }

        g2d.setColor(new Color(220, 0, 80));
        Xo = 700 / 2;
        Yo = 700 / 2;
        Xf = 670;
        Yf = 700 / 2;
        space = (Xo - Xf) / 29;

        for (int i = 0; i < 29; i++){
            g2d.drawLine(Xo, Yo, Xf + space * i, Yf - space * i);
        }

        g2d.setColor(new Color(0, 240, 60));
        Xo = 700 / 2;
        Yo = 700 / 2;
        Xf = 670;
        Yf = 700 / 2;
        space = (Xo - Xf) / 29;

        for (int i = 0; i < 29; i++){
            g2d.drawLine(Xo, Yo, Xf + space * i, Yf + space * i);
        }
    }
}