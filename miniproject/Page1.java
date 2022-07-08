package com.miniproject;
import javax.annotation.processing.RoundEnvironment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
public class Page1 {
    JFrame frame;
    Page1(){
        JFrame frame = new JFrame("Blood Bank Management System");
        ImageIcon first = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img.png"));
        Image second = first.getImage().getScaledInstance(400, 400,
                Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        JLabel picture = new JLabel(three);
        picture.setBounds(0, 0, 400, 400);
        Font text = new Font("Verdana", Font.BOLD, 14);
        JButton cont = new JButton("ADMIN");
        JButton don = new JButton("DONOR");
        JButton aboutus = new JButton("ABOUT US");
        aboutus.setBounds(150, 250, 100, 30);
        aboutus.setBackground(Color.red);
        aboutus.setForeground(Color.white);
        aboutus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Aboutus()).frame.setVisible(true);
            }
        });
        cont.setBounds(100, 130, 200, 40);
        cont.setFont(text);
        cont.setOpaque(true);
        cont.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        cont.setBackground(Color.red);
        cont.setForeground(Color.white);
        don.setBounds(100, 190, 200, 40);
        don.setFont(text);
        don.setOpaque(true);
        don.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        don.setBackground(Color.red);
        don.setForeground(Color.white);
        don.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page4()).frame.setVisible(true);
            }
        });
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new Page2()).frame.setVisible(true);
                frame.setVisible(false);
            }
        });
        frame.add(cont);
        frame.add(don);
        frame.add(picture);
        frame.add(aboutus);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page1 p1 = new Page1();
    }
}
