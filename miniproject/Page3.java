package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Page3 {
    JFrame frame;
    Page3(){
        frame = new JFrame("Blood Bank Management System");
        ImageIcon first = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_2.png"));
        Image second = first.getImage().getScaledInstance(400, 400,
                Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        JLabel picture = new JLabel(three);
        picture.setBounds(0,0, 400, 400);
        Font text = new Font("Times New Roman", Font.BOLD, 14);
        JButton adddonor = new JButton("ADD DONOR");
        adddonor.setBounds(20, 90, 150, 30);
        adddonor.setBackground(Color.white);
        adddonor.setForeground(Color.red);
        adddonor.setFont(text);
        adddonor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page6()).frame.setVisible(true);
            }
        });
        JButton sd = new JButton("SEARCH DONOR");
        sd.setBounds(20, 130, 150, 30);
        sd.setBackground(Color.white);
        sd.setForeground(Color.red);
        sd.setFont(text);
        sd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page4()).frame.setVisible(true);
            }
        });
        JButton bb = new JButton("BLOOD BANK");
        bb.setBounds(20, 170, 150, 30);
        bb.setBackground(Color.white);
        bb.setForeground(Color.red);
        bb.setFont(text);
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page8()).frame.setVisible(true);
            }
        });
        JButton br = new JButton("VIEW");
        br.setBounds(20, 210, 150, 30);
        br.setBackground(Color.white);
        br.setForeground(Color.red);
        br.setFont(text);
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new table_list()).frame.setVisible(true);
            }
        });
        JButton hd = new JButton("HELP");
        hd.setBounds(20, 250, 150, 30);
        hd.setBackground(Color.white);
        hd.setForeground(Color.red);
        hd.setFont(text);
        hd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page7()).frame.setVisible(true);
            }
        });
        JButton back = new JButton("BACK");
        back.setBounds(20, 290, 150, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.setFont(text);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page2()).frame.setVisible(true);
            }
        });
        frame.add(sd);
        frame.add(bb);
        frame.add(br);
        frame.add(hd);
        frame.add(adddonor);
        frame.add(picture);
        frame.add(back);
// frame.add(welcome);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page3 p3 = new Page3();
    }
}