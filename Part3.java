import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part3 extends JFrame {
    int WIDTH = 700;
    int HEIGHT = 730;
    JPanel panel = new JPanel();

    public Part3(){
        setTitle("Gráfico #3");
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
        g2d.setStroke(new BasicStroke(3)); 

        int Xo = 30, Yo = 60;
        int Xf = 670, Yf = 60;
        int botX = ((Xf - Xo) / 2) + Xo, botY = 700;
        int topRX = Xf, topRY = Yf;
        int topLX = Xo, topLY = Yo;

        for (int i = 0; i < 14; i++){
            if (i % 2 == 0){
                g2d.setColor(new Color(0, 80, 220));
            } else {
                g2d.setColor(new Color(220, 0, 80));
            }

            g2d.drawLine(topLX, topLY, topRX, topRY);
            g2d.drawLine(topRX, topRY, botX, botY);
            g2d.drawLine(botX, botY, topLX, topLY);

            botY -= 23;
            topLX += 22;
            topLY += 22;
            topRX -= 22;
            topRY += 22;
        }
    }
}