import java.awt.event.ActionListener;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class example8 extends JFrame implements ActionListener{
    JLabel l;
    JTextArea t1;
    JTextField t2;
    JButton b;
    JScrollPane s;
    JPanel p;
    public example8(){
        p=new JPanel();
        l=new JLabel("Distance in meters");
        t2=new JTextField(20);
        b=new JButton("Convert");
        t1=new JTextArea(10,20);
        // s=new JScrollPane(b);
        p.add(l);
        p.add(t2);
        p.add(b);
        p.add(t1);
        this.add(p);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
        t1.setEditable(false);
    }
    public void actionPerformed(ActionEvent e){
        double km=Double.parseDouble(t2.getText())/1000;
        t1.append(t2.getText()+" equal "+km+" km\n");
    }
    public static void main(String[] args) {
        new example8();
    }
}
