package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2,b3,b4;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Quiz");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. You are trained to be a programmer , answer point to point" + "<br><br>" +
                "2. They may also not know the answer" + "<br><br>" +
                "3. You may have lot of options  here all the questions are compulsory" + "<br><br>" +
                "4. Do  quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. Good Luck" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(100, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Easy");
        b2.setBounds(250, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Medium");
        b3.setBounds(400, 500, 100, 30);
        b3.setBackground(new Color(30, 144, 255));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("Hard");
        b4.setBounds(550, 500, 100, 30);
        b4.setBackground(new Color(30, 144, 255));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
        else if(ae.getSource() == b3){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
        else if(ae.getSource() == b4){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    
    public static void main(String[] args){
        new Rules("");
    }
}
