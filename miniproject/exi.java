package com.miniproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exi {
    JFrame frame;
    JButton exit;
    exi(){
        frame = new JFrame("EXIT");

        ImageIcon first = new ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_15.png"));
        Image second = first.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);

        JLabel picture = new JLabel(three);
        picture.setBounds(0, 0, 400, 400);
        exit = new JButton("");
        exit.setBounds(165, 155, 110, 60);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thanks for viewing");
                frame.setVisible(false);
            }
        });
        frame.add(exit);
        frame.add(picture);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        exi e = new exi();
    }
}