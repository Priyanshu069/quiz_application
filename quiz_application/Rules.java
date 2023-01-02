package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    Rules(String name)
    {
        this.name=name; 
       getContentPane().setBackground(Color.YELLOW);
       setLayout(null);
       
        JLabel heading=new JLabel("Rules for Quiz");
        heading.setBounds(40,60,600,45);
        heading.setFont(new Font("Italian", Font.BOLD,30));
        heading.setForeground((Color.RED));
        add(heading);
        
        //WRITING THE RULES FOR QUIZ
        JLabel rules=new JLabel();
        rules.setBounds(40,0,900,500);
        rules.setFont(new Font("Italian", Font.PLAIN,20));
        rules.setText("<html>"+"1. The test contains 10 questions"+"<br>"+
                               "2. There is time limit of 15 seconds for each question"+"<br>"+
                               "3. You will get 4 points for each correct answer"+"<br>"+
                               //"4. 25% marks will be deducted for each wrong answer"+"<br>"+
                               "4. No marks will be deducted for unattempted question"+"<br>"+
                
                       "<html>");
        add(rules);
        
        start=new JButton("Start");
        start.setBounds(350,500,100,35);
        start.setBackground((Color.BLUE));
        start.setForeground((Color.WHITE));
        start.addActionListener(this);
        add(start);
        
        back=new JButton("Back");
        back.setBounds(200,500,100,35);
        back.setBackground((Color.BLUE));
        back.setForeground((Color.WHITE));
        back.addActionListener(this);
        add(back);
        
       setSize(800,600);
       setLocation(350,100);
       setVisible(true);        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else if(e.getSource()==back)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[])
    {
        new Rules("User");
    }
}
