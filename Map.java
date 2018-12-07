package map;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
public class Map {

	public static void main(String[] args) {
		JFrame f = new JFrame("Eclipse");
        f.setSize(400, 300);
        f.setLocation(200, 200);
  
        f.setLayout(null);
        JLabel l=new JLabel("Back to Catan");
        l.setBackground(Color.BLACK);
        l.setBounds(150, 50, 280, 30);
        JButton b1=new JButton("Start");
        b1.setBounds(100, 120, 80, 30);
        JButton b2=new JButton("Help");
        b2.setVisible(true);
        b2.setBounds(200, 120, 80, 30);
        /*b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	b1.setVisible(false);
            	b2.setVisible(true);
            }
        });*/
        b2.setForeground(Color.RED);
        /*b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	b2.setVisible(false);
            	b1.setVisible(true);
            }
        });*/
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);

	}

}
