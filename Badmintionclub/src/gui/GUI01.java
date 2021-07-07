package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;


public class GUI01 implements ActionListener {
	

	private static final long serialVersionUID = 1L;
    static JButton button;
    static JFrame frame = new JFrame("6CS002/Portfolio-05");
    static Container panel;
    
    public static void main (String[]args) {
    	GUI01 gui = new GUI01();
        

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    
    panel.add(Box.createVerticalStrut(1));
    button = new JButton("Badmintion01");
    panel.add(button);
    button.addActionListener(gui); 
    panel.add(Box.createVerticalStrut(10));
    
   
    panel.add(Box.createVerticalStrut(1));
    button = new JButton("Badmintion02");
    panel.add(button);
    button.addActionListener(gui); 
    panel.add(Box.createVerticalStrut(10));

    
    panel.add(Box.createVerticalStrut(1));
    button = new JButton("Badmintion3");
    panel.add(button);
    button.addActionListener(gui); 
    panel.add(Box.createVerticalStrut(10));

    
    panel.add(Box.createVerticalStrut(1));
    button = new JButton("Badmintion4");
    panel.add(button);
    button.addActionListener(gui); 
    panel.add(Box.createVerticalStrut(10));

   
    panel.add(Box.createVerticalStrut(1));
    button = new JButton("Badmintion5");
    panel.add(button);
    button.addActionListener(gui); 
    panel.add(Box.createVerticalStrut(10));
    
    frame.setSize(450, 450);
    frame.add(panel);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    @Override
public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand(); 
    if (s.equals("Badmintion1")) { 
    	Badmintion01.readAndWrite();
    } else if (s.equals("Badmintion2")) { 
    	Badmintion02.readAndWrite();
    } else if (s.equals("Badmintion3")) { 
    	Badmintion3.readAndWrite();
    } else if (s.equals("Badmintion4")) {
    	Badmintion4.readAndWrite();
    } else if (s.equals("Badmintion5")) { 
    	Badmintion05.readAndWrite();
    } 
}

}

