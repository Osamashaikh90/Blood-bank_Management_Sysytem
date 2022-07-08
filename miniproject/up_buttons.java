package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class up_buttons {
    JFrame frame;
    JButton id,name,age,gender,bg,cn,add, adid;
    up_buttons(String idd){
        frame = new JFrame("Blood Bank Management System");
        Font head = new Font("Verdana", Font.BOLD, 16);
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        Font text11 = new Font("Verdana", Font.BOLD, 11);
        JLabel heading = new JLabel("BLOOD BANK MANAGEMENT SYSTEM");
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        id = new JButton("ID");
        id.setBounds(150, 70, 100, 20);
        id.setBackground(Color.white);
        id.setForeground(Color.red);
        id.setOpaque(true);
        id.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_id(idd)).frame.setVisible(true);
            }
        });
        name = new JButton("NAME");
        name.setBounds(150, 110, 100, 20);
        name.setBackground(Color.white);
        name.setForeground(Color.red);
        name.setOpaque(true);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_name(idd)).frame.setVisible(true);
            }
        });
        age = new JButton("AGE");
        age.setBounds(150, 150, 100, 20);
        age.setBackground(Color.white);
        age.setForeground(Color.red);
        age.setOpaque(true);
        age.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_age(idd)).frame.setVisible(true);
            }
        });
        gender = new JButton("GENDER");
        gender.setBounds(150, 190, 100, 20);
        gender.setBackground(Color.WHITE);
        gender.setForeground(Color.red);
        gender.setOpaque(true);
        gender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_gender(idd)).frame.setVisible(true);
            }
        });
        bg = new JButton("GROUP");
        bg.setBounds(150, 230, 100, 20);
        bg.setBackground(Color.white);
        bg.setForeground(Color.red);
        bg.setOpaque(true);
        bg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_bg(idd)).frame.setVisible(true);
            }
        });
        cn = new JButton("CONTACT");
        cn.setBounds(150, 270, 100, 20);
        cn.setBackground(Color.white);
        cn.setForeground(Color.red);
        cn.setOpaque(true);
        cn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_cn(idd)).frame.setVisible(true);
            }
        });
        add = new JButton("ADDRESS");
        add.setBounds(150, 310, 100, 20);
        add.setBackground(Color.white);
        add.setForeground(Color.red);
        add.setOpaque(true);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_ad(idd)).frame.setVisible(true);
            }
        });
        adid = new JButton("ADMIN ID");
        adid.setBounds(150, 350, 100, 20);
        adid.setBackground(Color.white);
        adid.setForeground(Color.red);
        adid.setOpaque(true);
        adid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_adid(idd)).frame.setVisible(true);
            }
        });
        JButton back = new JButton("<");
        back.setBounds(10, 60, 60, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_page()).frame.setVisible(true);
            }
        });
        frame.add(id);
        frame.add(name);
        frame.add(age);
        frame.add(gender);
        frame.add(bg);
        frame.add(cn);
        frame.add(add);
        frame.add(adid);
        frame.add(heading);
        frame.add(back);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        up_buttons u1 = new up_buttons("");
    }
}
