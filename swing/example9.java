import javax.swing.*;
import java.awt.event.*;

public class example9 extends JFrame implements ActionListener{
     JButton b;
     JTextField f1;
     JPasswordField f2;
     JTextArea t;
     JLabel l1;
     JLabel l2;
     JPanel p;
     public example9(){
         l1=new JLabel("Enter Name");
         l2=new JLabel("Enter Password");
         b=new JButton("Submit");
         f1=new JTextField(10);
         f2=new JPasswordField(10);
         t=new JTextArea(10,20);
         p=new JPanel();
         p.add(l1);
         p.add(f1);
         p.add(l2);
         p.add(f2);
         p.add(b);
         p.add(t);
         this.add(p);
         this.setSize(250,300);
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         t.setEditable(false);
         b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e){
         t.append("           Submitted Successfully"+"\n\n  Name : "+f1.getText()+"\n"+"  Password : "+f2.getText());
     }
     public static void main(String[] args) {
         new example9();
     }
}
