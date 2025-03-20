import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener
{
    JFrame jFrame;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;

    int count = 0;

    String str;

    boolean winStatus = false;

    TicTacToeGame()
    {
        jFrame = new JFrame("TicTacToe Game");
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridLayout(3,3));

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
    public static void main(String[] args)
    {
        new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count = count + 1;  //count++;

        if(count % 2 == 0)
        {
            str = "O";
        }
        else
        {
            str = "X";
        }

        if(e.getSource() == jb1)
        {
            jb1.setText(str);
            jb1.setEnabled(false);
            jb1.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb2)
        {
            jb2.setText(str);
            jb2.setEnabled(false);
            jb2.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb3)
        {
            jb3.setText(str);
            jb3.setEnabled(false);
            jb3.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb4)
        {
            jb4.setText(str);
            jb4.setEnabled(false);
            jb4.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb5)
        {
            jb5.setText(str);
            jb5.setEnabled(false);
            jb5.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb6)
        {
            jb6.setText(str);
            jb6.setEnabled(false);
            jb6.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb7)
        {
            jb7.setText(str);
            jb7.setEnabled(false);
            jb7.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb8)
        {
            jb8.setText(str);
            jb8.setEnabled(false);
            jb8.setFont(new Font("Arial", Font.BOLD, 60));
        }
        if(e.getSource() == jb9)
        {
            jb9.setText(str);
            jb9.setEnabled(false);
            jb9.setFont(new Font("Arial", Font.BOLD, 60));
        }

        winningPossibilities();
        whoWins();
    }

    public void winningPossibilities()
    {
        //horizontal match
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText() != "")
        {
            winStatus = true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() != "")
        {
            winStatus = true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() != "")
        {
            winStatus = true;
        }
        //vertical match
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() != "")
        {
            winStatus = true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() != "")
        {
            winStatus = true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() != "")
        {
            winStatus = true;
        }
        //diagonal match
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
        {
            winStatus = true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() != "")
        {
            winStatus = true;
        }
        else
        {
            winStatus = false;
        }
    }
    public void whoWins()
    {
        if(winStatus)
        {
            JOptionPane.showMessageDialog(jFrame, str+" wins");
            restartGame();
        }
        else if(!winStatus && count==9)
        {
            JOptionPane.showMessageDialog(jFrame, "Match Draw");
            restartGame();
        }
    }

    public void restartGame()
    {
        int i = JOptionPane.showConfirmDialog(jFrame, "Do you want to restart the game ?");
        if(i==0)
        {
            count = 0;
            str="";
            winStatus = false;

            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");

            setBtnEnabled(true);
        }
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            setBtnEnabled(false);
        }
    }

    public void setBtnEnabled(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}
