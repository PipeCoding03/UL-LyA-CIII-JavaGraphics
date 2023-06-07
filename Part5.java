import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part5 extends JFrame {
    int WIDTH = 700;
    int HEIGHT = 720;
    JPanel panel = new JPanel();

    public Part5(){
        setTitle("Gráfico #5");
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

        int Xo = 670, Yo = 670;
        int Xf = 30, Yf = 670;
        int space = (Xo - Xf) / 29;

        for (int i = 0; i < 29; i++){
            g2d.drawLine(Xo, Yo, Xf + space * i, Yf - space * i);
        }
    }
}