import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args){
        int WIDTH = 710;
        int HEIGHT = 450;
        int BUTTON_WIDTH = 100;
        int BUTTON_HEIGHT = 40;
        int BORDER = 40;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();
        JButton pt1_button = new JButton("Gráfico #1");
        JButton pt2_button = new JButton("Gráfico #2");
        JButton pt3_button = new JButton("Gráfico #3");
        JButton pt4_button = new JButton("Gráfico #4");
        JButton pt5_button = new JButton("Gráfico #5");

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
        pt2_button.setBounds(BORDER + BUTTON_WIDTH + 30, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
        panel.add(pt2_button);
        pt3_button.setBounds(BORDER + BUTTON_WIDTH * 2 + 30 * 2, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
        panel.add(pt3_button);
        pt4_button.setBounds(BORDER + BUTTON_WIDTH * 3 + 30 * 3, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
        panel.add(pt4_button);
        pt5_button.setBounds(BORDER + BUTTON_WIDTH * 4 + 30 * 4, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
        panel.add(pt5_button);

        pt1_button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part1();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        pt2_button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part2();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        pt3_button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part3();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        pt4_button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part4();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        pt5_button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part5();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
    }
}