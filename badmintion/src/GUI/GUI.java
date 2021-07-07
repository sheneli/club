package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    static JButton button;
    static JLabel label;
    static JFrame frame = new JFrame("6CS002/Portfolio-05");
    static Container panel;

    public static void main (String[]args) {
        GUI gui = new GUI();


        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        label = new JLabel("ForEach Function.");
        panel.add(label);
        panel.add(Box.createVerticalStrut(1));
        button = new JButton("Badminton01");
        panel.add(button);
        button.addActionListener(gui);
        panel.add(Box.createVerticalStrut(10));

        label = new JLabel("Parallel Streaming Function.");
        panel.add(label);
        panel.add(Box.createVerticalStrut(1));
        button = new JButton("Badminton02");
        panel.add(button);
        button.addActionListener(gui);
        panel.add(Box.createVerticalStrut(10));

        label = new JLabel("Min, Map, Reduce, Collect Function.");
        panel.add(label);
        panel.add(Box.createVerticalStrut(1));
        button = new JButton("Badminton3");
        panel.add(button);
        button.addActionListener(gui);
        panel.add(Box.createVerticalStrut(10));

        label = new JLabel("Filter & ForEach Function.");
        panel.add(label);
        panel.add(Box.createVerticalStrut(1));
        button = new JButton("Badminton4");
        panel.add(button);
        button.addActionListener(gui);
        panel.add(Box.createVerticalStrut(10));

        label = new JLabel("Sorted Function");
        panel.add(label);
        panel.add(Box.createVerticalStrut(1));
        button = new JButton("Badminton5");
        panel.add(button);
        button.addActionListener(gui);
        panel.add(Box.createVerticalStrut(10));

        frame.setSize(450, 450);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Badminton1")) {
            BadmintonCSV01.readAndWrite();
        } else if (s.equals("Badminton2")) {
            BadmintonCSV02.readAndWrite();
        } else if (s.equals("Badminton3")) {
            BadmintonCSV03.readAndWrite();
        } else if (s.equals("Badminton4")) {
            BadmintonCSV04.readAndWrite();
        } else if (s.equals("Badminton5")) {
            BadmintonCSV05.readAndWrite();
        }
    }
}