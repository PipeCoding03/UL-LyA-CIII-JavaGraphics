import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Main {
    public static void main(String[] args){
        int WIDTH = 710;
        int HEIGHT = 450;
        int BUTTON_WIDTH = 100;
        int BUTTON_HEIGHT = 40;
        int BORDER = 40;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();
        JButton buttons[] = new JButton[5];

        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        panel.setLayout(null);
        window.getContentPane().add(panel);
        panel.setBackground(new Color(247, 68, 68));

        for (int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton("Gráfico #" + (i + 1));
            buttons[i].setBounds(BORDER + BUTTON_WIDTH * i + 30 * i, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
            panel.add(buttons[i]);
        }

        for (JButton button: buttons){
            button.setBackground(new Color(43, 113, 228));
            button.setForeground(Color.WHITE);
            button.setBorder(new LineBorder(Color.BLACK, 3));
        }

        buttons[0].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part1();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        buttons[1].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part2();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        buttons[2].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part3();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        buttons[3].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part4();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });

        buttons[4].addMouseListener(new MouseListener(){
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