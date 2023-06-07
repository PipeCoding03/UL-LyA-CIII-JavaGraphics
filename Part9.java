import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part9 extends JFrame {
    int WIDTH = 820;
    int HEIGHT = 900;
    JPanel panel = new JPanel();

    public Part9(){
        setTitle("Gráfico #9");
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

        int Xo = 40, Yo = 800 - 10;
        int Xf = Yo, Yf = Yo;

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo + 20 * i, Yo, Xf, Yf - 20 * i);
        }

        g2d.setColor(new Color(220, 0, 60));

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf, Yf - 20 * i, Xf - 20 * i, Xo);
        }

        g2d.setColor(new Color(0, 220, 120));

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xf - 20 * i, Xo, Xo, Xo + 20 * i);
        }

        g2d.setColor(new Color(255, 165, 0));

        for (int i = 0; i < 36; i++){
            g2d.drawLine(Xo, Xo + 20 * i, Xo + 20 * i, Yo);
        }
    }
}