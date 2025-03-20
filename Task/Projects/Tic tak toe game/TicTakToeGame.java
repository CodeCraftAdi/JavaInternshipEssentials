import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTakToeGame implements ActionListener{
        
        JFrame jFrame;
        JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;

           
    public TicTakToeGame() {
        jFrame = new JFrame("TicTacToe Game");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridLayout(3, 3));

        jb1 = new JButton();
        jb1.addActionListener(this);
        jFrame.add(jb1);

        jb2 = new JButton();
        jb2.addActionListener(this);
        jFrame.add(jb2);

        jb3 = new JButton();
        jb3.addActionListener(this);
        jFrame.add(jb3);

        jb4 = new JButton();
        jb4.addActionListener(this);
        jFrame.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jFrame.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jFrame.add(jb6);
        
        jb7 = new JButton();
        jb7.addActionListener(this);
        jFrame.add(jb7);

        jb8 = new JButton();
        jb8.addActionListener(this);
        jFrame.add(jb8);
        
        jb9 = new JButton();
        jb9.addActionListener(this);
        jFrame.add(jb9);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new TicTakToeGame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            jb1.setText("X");
        }
    }
    
}