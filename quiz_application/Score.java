package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    //JButton submit;
    Score(String name,int score){
        
        
        setBounds(0,0,1200,700);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/result.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1200,300);    
        add(image);
        
        
        JLabel heading=new JLabel("Thanks " +name+" for participating in Java Quiz");
        heading.setBounds(100,350,1200,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        
        JLabel lscore=new JLabel("Your total score is "+score);
        lscore.setBounds(200,450,1200,30);
        lscore.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lscore);
        
        JButton submit=new JButton("End Quiz");
        submit.setBounds(210,520,150,35);
        submit.setFont(new Font("Tahoma",Font.BOLD,20));
        submit.setBackground((Color.BLUE));
        submit.setForeground((Color.WHITE));
        submit.addActionListener(this);   //ActionListener is used for using the next button
        add(submit);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
         setVisible(false);
    }
    
    public static void main(String []args)
    {
        new Score("User",0);
    }
    
}
