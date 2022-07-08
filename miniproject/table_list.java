package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class table_list {
    JFrame frame;
    JButton donor,admin,blood_bank;
    table_list(){
        frame = new JFrame("Blood Bank Management System");
        ImageIcon f1 = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_16.png"));
        Image s1 = f1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon t1 = new ImageIcon(s1);
        JLabel p1 = new JLabel(t1);
        p1.setBounds(150,40,50, 50);
        ImageIcon f2 = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_16.png"));
        Image s2 = f2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon t2 = new ImageIcon(s2);
        JLabel p2 = new JLabel(t2);
        p2.setBounds(150,130,50, 50);
        ImageIcon f3 = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_16.png"));
        Image s3 = f3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(s3);
        JLabel p3 = new JLabel(t1);
        p3.setBounds(150,220,50, 50);
        donor = new JButton("Donor");
        donor.setBounds(200, 40, 100, 50);
        donor.setOpaque(true);
        donor.setBackground(Color.white);
        donor.setForeground(Color.red);
        donor.setBorderPainted(false);
        donor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                (new show_table()).frame.setVisible(true);
            }
        });
        admin = new JButton("Admin");
        admin.setBounds(200, 130, 100, 50);
        admin.setOpaque(true);
        admin.setBackground(Color.white);
        admin.setForeground(Color.red);
        admin.setBorderPainted(false);
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                (new show_admin()).frame.setVisible(true);
            }
        });
        blood_bank = new JButton("Blood Bank");
        blood_bank.setBounds(200, 220, 100, 50);
        blood_bank.setOpaque(true);
        blood_bank.setBackground(Color.white);
        blood_bank.setForeground(Color.red);
        blood_bank.setBorderPainted(false);
        blood_bank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                (new show_bb()).frame.setVisible(true);
            }
        });
        JButton back = new JButton("<");
        back.setBounds(10, 300, 60, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    frame.setVisible(false);
                    (new Page3()).frame.setVisible(true);
                }catch (Exception ee){
                }
            }
        });
        frame.setSize(400, 400);
        frame.add(p1);
        frame.add(p2);
        frame.add(admin);
        frame.add(blood_bank);
        frame.add(p3);
        frame.add(back);
        frame.add(donor);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        table_list t = new table_list();
    }
}
