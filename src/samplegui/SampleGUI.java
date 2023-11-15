package samplegui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SampleGUI {
    static JFrame fr;
    static JPanel p1;
    static JLabel l1;
    static JLabel l2;
    static JTextField t1;
    static JTextField t2;
    static JButton b1;
    public static void main(String[] args) {
        fr=new JFrame();
        Image icon=Toolkit.getDefaultToolkit().getImage("icon.png");
        fr.setTitle("Nestor GUI");
        p1=new JPanel();
        p1.setLayout(null);
        l1=new JLabel ("Enter a Number: ");
        l1.setBounds(25,30,150,30);
        l2=new JLabel ("Enter a Number: ");
        l2.setBounds(25,60,250,30);
        t1=new JTextField(20);
        t1.setBounds(140,30,150,30);
        t2=new JTextField(20);
        t2.setBounds(140,60,150,30);
        b1=new JButton("CLICK ME");
        b1.setBounds(160,100,100,30);
        b1.addActionListener(new Nestor());
        fr.add(p1);
        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        
        fr.setIconImage(icon);
        fr.setSize(350, 200);
        fr.setLocation(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public static class Nestor implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(fr, "Thanks for clicking the button");
        }
     }
}
