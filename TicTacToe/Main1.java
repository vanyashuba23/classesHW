import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main1 implements ActionListener {


    private JPanel test;

    private static JFrame jFrame;

    private Player playerX;

    private Player player0;


    private int currentMove;

    private JLabel moveInfo;

    private JButton[] buttons = new JButton[9];

    public static void main(String[] args) {
        jFrame = new JFrame("Hello world");

    }

    private void startGame() {

        playerX = new Player(Sides.X);
        player0 = new Player(Sides.O);
        currentMove = 0;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(this);
            moveInfo = new JLabel();
            moveInfo.setFont(new Font("Comic-sans", Font.PLAIN, 30));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}