package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class del_page {
    JFrame frame;
    JLabel name;
    JButton delete, back;
    JTextField namme;
    String getid;
    del_page(){
        frame = new JFrame("Blood Bank Management System");
        Font head = new Font("Verdana", Font.BOLD, 16);
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        JLabel heading = new JLabel("BLOOD BANK MANAGEMENT SYSTEM");
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        name = new JLabel("Enter ID To Delete ");
        name.setBounds(125, 100, 150, 20);
        name.setFont(text12);
        name.setForeground(Color.white);
        namme = new JTextField("");
        namme.setBounds(125, 130, 120, 20);
        namme.setFont(text12);
        namme.setForeground(Color.red);
        namme.setBorder(BorderFactory.createLineBorder(Color.red));
        delete = new JButton("DELETE");
        delete.setBounds(135, 160, 100, 30);
        delete.setBackground(Color.white);
        delete.setForeground(Color.red);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    getid = namme.getText();
                    if(getid.equals("") || getid.equals(" ")){
                        JOptionPane.showMessageDialog(null, "Invalid Entry!!");
                        return;
                    }
                    connection c = new connection();
                    String query = "delete from donor where donor_id = "+getid;
                    String query1 = "delete from blood_bank where bank_id = "+getid;
                    int h = c.statement.executeUpdate(query1);
                    int hh = c.statement.executeUpdate(query);
                    if(hh>0){
                        JOptionPane.showMessageDialog(null, "Deleted Successfully");
                        frame.setVisible(false);
                        (new Page3()).frame.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid ID!!");
                        namme.setText(" ");
                    }
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
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
        frame.add(namme);
        frame.add(name);
        frame.add(delete);
        frame.add(back);
        frame.add(heading);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        del_page dp = new del_page();
    }
}
