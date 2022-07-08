package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Page2 {
    JFrame frame;
    JLabel ladmin;
    JTextField admin;
    JLabel lpass;
    JPasswordField pass;
    JButton login;
    String getID;
    String getPass;
    Page2(){
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
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_1.png"));
        Image second = first.getImage().getScaledInstance(100, 100,
                Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        JLabel picture = new JLabel(three);
        picture.setBounds(10, 50, 100, 100);
        ladmin = new JLabel("Admin Id :");
        ladmin.setBounds(120, 60, 70, 20);
        ladmin.setForeground(Color.red);
        ladmin.setFont(text12);
        admin = new JTextField("");
        admin.setBounds(200, 60, 90, 20);
        admin.setForeground(Color.red);
        admin.setFont(text12);
        lpass = new JLabel("Password :");
        lpass.setBounds(120, 90, 70, 20);
        lpass.setFont(text11);
        lpass.setForeground(Color.red);
        pass = new JPasswordField("");
        pass.setBounds(200, 90, 90, 20);
        pass.setForeground(Color.red);
        pass.setFont(text11);
        login = new JButton("LOGIN");
        login.setBounds(100, 170, 100, 20);
        login.setBackground(Color.red);
        login.setFont(text12);
        login.setForeground(Color.white);
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
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    connection conn = new connection();
                    getID = admin.getText();
                    getPass = String.valueOf(pass.getPassword());
                    if (getID.equals("") && getPass.equals("")) {
                        JOptionPane.showMessageDialog(null, "Enter ID And Password First!!!");
                        return;
                    }
                    String query = "select * from admin where admin_id ="+getID;
                    ResultSet rs = conn.statement.executeQuery(query);
                    while (rs.next()) {
                        if (rs.getString(1).equals(getID) && rs.getString(3).equals(getPass)) {
                            frame.setVisible(false);
                            (new Page3()).frame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Login", "Alert",
                                    JOptionPane.WARNING_MESSAGE);
                            admin.setText("");
                            pass.setText("");
                        }
                    }
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        panel.add(login);
        panel.add(pass);
        panel.add(lpass);
        panel.add(ladmin);
        panel.add(admin);
        panel.add(picture);
        frame.add(heading);
        frame.add(panel);
        frame.add(back);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page2 p2 = new Page2();
    }
}