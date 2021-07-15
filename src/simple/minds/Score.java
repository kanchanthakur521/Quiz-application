package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing QUIZ GAME");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        add(l2);
        if (score==5){
        JLabel l3 = new JLabel("Your Score ->  very Strong  "  + "("+score+")"  );
        
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        } 
        if (score==4){
        JLabel l3 = new JLabel("Your Score -> Strong  "  + "("+score+")" );
        
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        }
        if (score==3){
        JLabel l3 = new JLabel("Your Score -> Good  "  + "("+score+")"  );
        
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        }
        if (score==2){
        JLabel l3 = new JLabel("Your Score -> Bad  "  + "("+score+")" );
        
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        }
        if (score==1){
        JLabel l3 = new JLabel("Your Score -> Poor  " + "("+score+") general lnowledge");
        
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        }
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(400, 270, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
