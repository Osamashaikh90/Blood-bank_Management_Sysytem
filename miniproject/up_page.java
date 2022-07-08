package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class up_page {
    JFrame frame;
    JLabel name;
    JTextField namme;
    JButton update, back;
    String getid;
    up_page(){
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
        name = new JLabel("Enter ID To Update ");
        name.setBounds(125, 100, 150, 20);
        name.setFont(text12);
        name.setForeground(Color.white);
        namme = new JTextField("");
        namme.setBounds(125, 130, 120, 20);
        namme.setFont(text12);
        namme.setForeground(Color.red);
        namme.setBorder(BorderFactory.createLineBorder(Color.red));
        update = new JButton("UPDATE");
        update.setBounds(135, 160, 100, 30);
        update.setBackground(Color.white);
        update.setForeground(Color.red);
        back = new JButton("BACK");
        back.setBounds(135, 200, 100, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page7()).frame.setVisible(true);
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    getid = namme.getText();
                    connection c = new connection();
                    if(getid.equals("") || getid.equals(" ")){
                        JOptionPane.showMessageDialog(null, "Please Enter Valid ID.");
                        return;
                    }
                    frame.setVisible(false);
                    (new up_buttons(getid)).frame.setVisible(true);
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        frame.add(heading);
        frame.add(name);
        frame.add(namme);
        frame.add(update);
        frame.add(back);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        up_page up = new up_page();
    }
}
