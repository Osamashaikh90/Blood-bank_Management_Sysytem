package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Page4 {
    JFrame frame;
    JLabel ldonor;
    JTextField donor;
    JButton login;
    String getID;
    Page4(){
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
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 200);
        panel.setOpaque(true);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        ImageIcon first = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_3.png"));
        Image second = first.getImage().getScaledInstance(100, 100,
                Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        JLabel picture = new JLabel(three);
        picture.setBounds(10, 50, 100, 100);
        JLabel dl = new JLabel("DONOR LOGIN");
        dl.setBounds(100, 10, 100, 30);
        dl.setFont(text12);
        dl.setForeground(Color.red);
        ldonor = new JLabel("Donor Id :");
        ldonor.setBounds(120, 90, 70, 20);
        ldonor.setForeground(Color.red);
        ldonor.setFont(text12);
        donor = new JTextField("");
        donor.setBounds(200, 90, 90, 20);
        donor.setForeground(Color.red);
        donor.setFont(text12);
        login = new JButton("GET DETAILS");
        login.setBounds(75, 170, 150, 20);
        login.setBackground(Color.red);
        login.setFont(text12);
        login.setForeground(Color.white);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    getID = donor.getText();
                    if(getID.equals("")){
                        JOptionPane.showMessageDialog(null, "No Such Donor Is Present.");
                    }
                    connection c = new connection();
                    String query = "select * from donor where donor_id ="+getID;
                    ResultSet rs = c.statement.executeQuery(query);
                    if(rs.next()){
                        frame.setVisible(false);
                        (new Page5(getID)).frame.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No Such Donor Is Present.");
                    }
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        JButton back = new JButton("<");
        back.setBounds(10, 60, 60, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    frame.setVisible(false);
                    (new Page1()).frame.setVisible(true);
                }catch (Exception ee){
// System.out.println(ee);
                }
            }
        });
        frame.add(back);
        panel.add(dl);
        panel.add(ldonor);
        panel.add(donor);
        panel.add(login);
        panel.add(picture);
        frame.add(panel);
        frame.add(heading);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page4 p4 = new Page4();
    }
}