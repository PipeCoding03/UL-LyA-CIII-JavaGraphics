import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Main {
    public static void main(String[] args){
        int WIDTH = 720;
        int HEIGHT = 230;
        int BUTTON_WIDTH = 100;
        int BUTTON_HEIGHT = 40;
        int BORDER = 40;
        JFrame window = new JFrame("Java Graphics");
        JPanel panel = new JPanel();
        JButton buttons[] = new JButton[10];

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
            if (i < 5){
                buttons[i].setBounds(BORDER + BUTTON_WIDTH * i + 30 * i, BORDER, BUTTON_WIDTH, BUTTON_HEIGHT);
            } else {
                buttons[i].setBounds(BORDER + BUTTON_WIDTH * (i - 5) + 30 * (i - 5), BORDER + BUTTON_HEIGHT + 30, BUTTON_WIDTH, BUTTON_HEIGHT);
            }
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
        buttons[5].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part6();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
        buttons[6].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part7();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
        buttons[7].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part8();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
        buttons[8].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part9();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
        buttons[9].addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                new Part10();
            }

            @Override public void mousePressed(MouseEvent e){}
            @Override public void mouseReleased(MouseEvent e){}
            @Override public void mouseEntered(MouseEvent e){}
            @Override public void mouseExited(MouseEvent e){}
        });
    }
}