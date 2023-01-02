
package quiz_application;

import javax.swing.*;  //...for importing JFrame class
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{   //...JFrame is used for frame
    
    JButton rules,back;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/q1.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,600);    
        add(image);
           
        JLabel heading=new JLabel("Simple quiz of Java");
        heading.setBounds(700,60,300,45);
        heading.setFont(new Font("Italian", Font.BOLD,30));
        heading.setForeground((Color.RED));
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(750,150,220,40);
        name.setFont(new Font("Italian", Font.BOLD,20));
        name.setForeground((Color.BLUE));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(730,200,220,25);
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(730,250,100,25);
        rules.setBackground((Color.BLUE));
        rules.setForeground((Color.WHITE));
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(850,250,100,25);
        back.setBackground((Color.BLUE));
        back.setForeground((Color.WHITE));
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(1200,630);
        setLocation(100,100);
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules)
        {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(e.getSource()==back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String []args)
    {
        new Login();  //...class anonymous object
    }
}
