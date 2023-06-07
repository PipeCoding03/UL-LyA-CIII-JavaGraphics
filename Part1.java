import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part1 extends JFrame {
    int WIDTH = 600;
    int HEIGHT = 600;
    JPanel panel = new JPanel();

    public Part1(){
        setTitle("Gráfico #1");
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
        g2d.setColor(new Color(0, 80, 220));

        int Xo = 50, Yo = 550;
        int Xf = 550, Yf = 550;
        int topX = ((Xf - Xo) / 2) + Xo, topY = Xo;
        int botRX = Xf, botRY = Yf;
        int botLX = Xo, botLY = Yo;

        for (int i = 0; i < 11; i++){
            g2d.drawLine(botLX, botLY, botRX, botRY);
            g2d.drawLine(botRX, botRY, topX, topY);
            g2d.drawLine(topX, topY, botLX, botLY);

            topY += 23;
            botLX += 24;
            botLY -= 24;
            botRX -= 24;
            botRY -= 24;
        }
    }
}