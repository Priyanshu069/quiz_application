package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{    
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String ans_choosen[][]=new String[10][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,submit;
    ButtonGroup group;
    public static int timer=15;
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    String name;
    
    Quiz(String name)
    {
        this.name=name;
        setBounds(0,0,1200,700);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/q7.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1200,300);    
        add(image);
        
        qno=new JLabel("1");
        qno.setBounds(100,350,50,30);
        qno.setFont(new Font("Tahoma",Font.ITALIC,20));
        add(qno);
        
        question=new JLabel("This is a question");
        question.setBounds(120,350,1200,30);
        question.setFont(new Font("Tahoma",Font.ITALIC,20));
        add(question);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "Which of the following is not a Java features?";
        questions[1][1] = "Dynamic";
        questions[1][2] = "Architecture Neutral";
        questions[1][3] = "Use of pointers";
        questions[1][4] = "Object-oriented";

        questions[2][0] = "What does the expression float a = 35 / 0 return?";
        questions[2][1] = "0";
        questions[2][2] = "Not a number";
        questions[2][3] = "infinity";
        questions[2][4] = "run time exception";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "Which of the following for loop declaration is not valid?";
        questions[4][1] = "for ( int i = 99; i >= 0; i / 9 )";
        questions[4][2] = "for ( int i = 7; i <= 77; i += 7 )";
        questions[4][3] = "for ( int i = 20; i >= 2; - -i )";
        questions[4][4] = "for ( int i = 2; i <= 20; i = 2* i )";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "Use of pointers";
        answers[2][1] = "infinity";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "for ( int i = 99; i >= 0; i / 9 )";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        opt1=new JRadioButton();
        opt1.setBounds(100,400,500,20);
        opt1.setBackground((Color.YELLOW));
        opt1.setFont(new Font("Dialog",Font.PLAIN,15));
        add(opt1);
        
        opt2=new JRadioButton();
        opt2.setBounds(100,425,500,20);
        opt2.setBackground((Color.YELLOW));
        opt2.setFont(new Font("Dialog",Font.PLAIN,15));
        add(opt2);
        
        opt3=new JRadioButton();
        opt3.setBounds(100,450,500,20);
        opt3.setBackground((Color.YELLOW));
        opt3.setFont(new Font("Dialog",Font.PLAIN,15));
        add(opt3);
        
        opt4=new JRadioButton();
        opt4.setBounds(100,475,500,20);
        opt4.setBackground((Color.YELLOW));
        opt4.setFont(new Font("Dialog",Font.PLAIN,15));
        add(opt4);
        
        group=new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);
        
        next=new JButton("Next");
        next.setBounds(850,475,100,35);
        next.setBackground((Color.BLUE));
        next.setForeground((Color.WHITE));
        next.addActionListener(this);   //ActionListener is used for using the next button
        add(next);
        
        submit=new JButton("Submit");
        submit.setBounds(850,520,100,35);
        submit.setBackground((Color.BLUE));
        submit.setForeground((Color.WHITE));
        submit.addActionListener(this);   //ActionListener is used for using the next button
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
           if(e.getSource()==next)
           {
               repaint();
               opt1.setEnabled(true);
              opt2.setEnabled(true);
              opt3.setEnabled(true);
              opt4.setEnabled(true);
            
                ans_given=1;
                if(group.getSelection()==null)
               {
                ans_choosen[count][0]="";
               }
                else
               {
                ans_choosen[count][0]=group.getSelection().getActionCommand();
               }
                
                if(count==8)
                {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                
               count++;
               start(count);
           }
           else if(e.getSource()==submit)
           {
               ans_given = 1;
               if (group.getSelection() == null)
               {
                ans_choosen[count][0] = "";
               } 
                else 
                 {
                    ans_choosen[count][0] = group.getSelection().getActionCommand();
                 }
                 for (int i = 0; i < ans_choosen.length; i++) 
                 {
                     if (ans_choosen[i][0] == null) {
                     // Do nothing if the answer is null
                     } else if (ans_choosen[i][0] != null && ans_choosen[i][0].equals(answers[i][1])) {
                     score += 4;
                     } //else if (ans_choosen[i][0] != null && !ans_choosen[i][0].equals(answers[i][1])){
                     //score -= 1;
                     //}
                 
                 }
            
            setVisible(false);
            new Score(name, score);
        }
     }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        String time="Time left - "+timer+" seconds";
        g.setColor(Color.red);
        g.setFont(new Font("ITALIC",Font.BOLD,20));
        
        if(timer>0)
        {
            g.drawString(time, 850, 450);
        }
        else
        {
            g.drawString("Times Up!!", 850, 450);
        }
        timer--;
        
        try
        {
            Thread.sleep(1000);
            repaint();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        if(ans_given==1)
        {
            ans_given=0;
            timer=15;
        }
        else if(timer<0)
        {
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
             if(count==8)
                {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
            
            if(count==9)
                {
                    if(group.getSelection()==null)
                    {
                     ans_choosen[count][0]="";
                    }
                    else
                    {
                     ans_choosen[count][0]=group.getSelection().getActionCommand();
                    }
                    for(int i=0; i<ans_choosen.length; i++)
                    {
                        
                         if (ans_choosen[i][0] == null) {
                         // Do nothing if the answer is null
                         } else if (ans_choosen[i][0] != null && ans_choosen[i][0].equals(answers[i][1])) {
                          score += 4;
                         }// else if (ans_choosen[i][0] != null && !ans_choosen[i][0].equals(answers[i][1])){
                         //score -= 1;
                         //}
                    
                             
                    }
                    setVisible(false);
                    new Score(name,score);
                }
                
            else
            {
                if(group.getSelection()==null)
                {
                 ans_choosen[count][0]="";
                }
                else
                {
                 ans_choosen[count][0]=group.getSelection().getActionCommand();
                }
              count++;
              start(count);
            }
        }
        
    }
    public void start(int count)
    {
        qno.setText("" + (count+1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        group .clearSelection();
    }
    
    public static void main(String []args)
    {
        new Quiz("User");
    }

}
