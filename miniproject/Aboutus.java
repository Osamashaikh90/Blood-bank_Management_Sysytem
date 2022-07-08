package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Aboutus {
    JFrame frame;
    JButton exi;
    Aboutus(){
        frame = new JFrame("Blood Bank Management System");
        ImageIcon first = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_4.png"));
        Image second = first.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        ImageIcon f1 = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_5.png"));
        Image s1 = f1.getImage().getScaledInstance(400, 350, Image.SCALE_DEFAULT);
        ImageIcon t1 = new ImageIcon(s1);
        Font text = new Font("Times New Roman", Font.BOLD, 18);
        JLabel picture = new JLabel(three);
        picture.setBounds(0, 0, 50, 50);
        JLabel pic = new JLabel(t1);
        pic.setBounds(0, 50, 400, 350);
        JLabel heading = new JLabel(" Xavier Institute Of Engineering");
        heading.setBounds(50, 0, 350, 50);
        heading.setFont(text);
        heading.setOpaque(true);
        heading.setBackground(Color.black);
        heading.setForeground(Color.white);
        JButton back = new JButton("<");
        back.setBounds(10, 360, 60, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    frame.setVisible(false);
                    (new Page1()).frame.setVisible(true);
                }catch (Exception ee){
                }
            }
        });
        exi = new JButton("EXIT");
        exi.setBounds(320, 360, 60, 30);
        exi.setBackground(Color.white);
        exi.setForeground(Color.red);
        exi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new exi()).frame.setVisible(true);
            }
        });
        frame.add(heading);
        frame.add(pic);
        frame.add(picture);
        frame.add(back);
        frame.add(exi);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Aboutus a1 = new Aboutus();
    }
}
