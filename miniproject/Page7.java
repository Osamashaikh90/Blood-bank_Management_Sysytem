package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Page7 {
    JFrame frame;
    JButton delete;
    JButton update;
    JButton back;
    Page7(){
        Font head = new Font("Verdana", Font.BOLD, 16);
        frame = new JFrame("Blood Bank Management System");
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        JLabel heading = new JLabel("BLOOD BANK MANAGEMENT SYSTEM");
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        delete = new JButton("DELETE");
        delete.setBounds(150, 120, 100, 30);
        delete.setBackground(Color.white);
        delete.setForeground(Color.red);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new del_page()).frame.setVisible(true);
            }
        });
        update = new JButton("UPDATE");
        update.setBounds(150, 160, 100, 30);
        update.setBackground(Color.white);
        update.setForeground(Color.red);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_page()).frame.setVisible(true);
            }
        });
        back = new JButton("BACK");
        back.setBounds(150, 200, 100, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page3()).frame.setVisible(true);
            }
        });
        frame.add(delete);
        frame.add(update);
        frame.add(back);
        frame.add(heading);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page7 p7 = new Page7();
    }
}
