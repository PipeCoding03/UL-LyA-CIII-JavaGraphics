import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Part8 extends JFrame {
    int WIDTH = 800;
    int HEIGHT = 720;
    JPanel panel = new JPanel();

    public Part8(){
        setTitle("Gráfico #8");
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

        int diff = 60;
        int Xo = 50, Yo = 800 - 50;
        int Xf = Yo, Yf = Yo;
        int botRX = Xf, botRY = Yf;
        int botLX = Xo, botLY = Yo;

        for (int i = 0; i < 27; i++){
            g2d.drawLine(botLX + 26 * i, botLY - diff, botRX - 12 * i, botRY - 24 * i - diff);
        }

        g2d.setColor(new Color(0, 220, 120));
        Xo = botLX + 26 * 27;
        Yo = botLY;
        Xf = botRX - 12 * 27;
        Yf = botRY - 24 * 27;
        
        for (int i = 0; i < 27; i++){
            g2d.drawLine(Xo - 12 * i, Yo - 24 * i - diff, Xf - 14 * i, Yf + 24 * i - diff);
        }

        g2d.setColor(new Color(220, 0, 90));
        Xo = Xo - 12 * 27;
        Yo = Yo - 24 * 27;
        Xf = 50;
        Yf = 800 - 50;
        
        for (int i = 0; i < 27; i++){
            g2d.drawLine(Xo - 14 * i, Yo + 24 * i - diff, Xf + 26 * i, Yf - diff);
        }
    }
}