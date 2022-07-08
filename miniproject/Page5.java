package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Page5 {
    JFrame frame;
    JLabel lid;
    JLabel lname;
    JLabel lage;
    JLabel lgender;
    JLabel lbg;
    JLabel lcn;
    JLabel la, ladid;
    JLabel idd,name,age,gender,bg,cn, ad, adid;
    Page5(String id){
        frame = new JFrame("Blood Bank Management System");
        Font head = new Font("Verdana", Font.BOLD, 16);
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        JLabel heading = new JLabel("");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        lid = new JLabel("ID : ");
        lid.setBounds(20, 70, 100, 20);
        lid.setForeground(Color.white);
        lid.setFont(text12);
        lname = new JLabel("NAME : ");
        lname.setBounds(20, 100, 100, 20);
        lname.setForeground(Color.white);
        lname.setFont(text12);
        lage = new JLabel("AGE : ");
        lage.setBounds(20, 130, 100, 20);
        lage.setForeground(Color.white);
        lage.setFont(text12);
        lgender = new JLabel("GENDER : ");
        lgender.setBounds(20, 160, 100, 20);
        lgender.setForeground(Color.white);
        lgender.setFont(text12);
        lbg = new JLabel("GROUP : ");
        lbg.setBounds(20, 190, 100, 20);
        lbg.setForeground(Color.white);
        lbg.setFont(text12);
        lcn = new JLabel("CONTACT : ");
        lcn.setBounds(20, 220, 100, 20);
        lcn.setForeground(Color.white);
        lcn.setFont(text12);
        la = new JLabel("ADDRESS : ");
        la.setBounds(20, 250, 100, 20);
        la.setForeground(Color.white);
        la.setFont(text12);
        ladid = new JLabel("ADMIN ID : ");
        ladid.setBounds(20, 280, 100, 20);
        ladid.setForeground(Color.white);
        ladid.setFont(text12);
        idd = new JLabel("");
        idd.setBounds(130, 70, 100, 20);
        idd.setForeground(Color.white);
        name = new JLabel("");
        name.setBounds(130, 100, 100, 20);
        name.setForeground(Color.white);
        age = new JLabel("");
        age.setBounds(130, 130, 100, 20);
        age.setForeground(Color.white);
        gender = new JLabel("");
        gender.setBounds(130, 160, 100, 20);
        gender.setForeground(Color.white);
        bg = new JLabel("");
        bg.setBounds(130, 190, 100, 20);
        bg.setForeground(Color.white);
        cn = new JLabel("");
        cn.setBounds(130, 220, 100, 20);
        cn.setForeground(Color.white);
        ad = new JLabel("");
        ad.setBounds(130, 250, 100, 20);
        ad.setForeground(Color.white);
        adid = new JLabel("");
        adid.setBounds(130, 280, 100, 20);
        adid.setForeground(Color.white);
        JButton back = new JButton("<");
        back.setBounds(10, 330, 60, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    frame.setVisible(false);
                    (new Page4()).frame.setVisible(true);
                }catch (Exception ee){
// System.out.println(ee);
                }
            }
        });
        try{
            connection c = new connection();
            String query = "select * from donor where donor_id="+id;
            ResultSet rs = c.statement.executeQuery(query);
            while(rs.next()){
                idd.setText(rs.getString(1));
                name.setText(rs.getString(2));
                heading.setText("Hello "+rs.getString(2));
                age.setText(rs.getString(3));
                gender.setText(rs.getString(4));
                bg.setText(rs.getString(5));
                cn.setText(rs.getString(6));
                ad.setText(rs.getString(7));
                adid.setText(rs.getString(8));
            }
        }catch (Exception ee){
            System.out.println(ee);
        }
        frame.add(heading);
        frame.add(lid);
        frame.add(lname);
        frame.add(lage);
        frame.add(lgender);
        frame.add(lbg);
        frame.add(lcn);
        frame.add(back);
        frame.add(idd);
        frame.add(name);
        frame.add(age);
        frame.add(gender);
        frame.add(bg);
        frame.add(ad);
        frame.add(cn);
        frame.add(la);
        frame.add(ladid);
        frame.add(adid);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page5 p5 = new Page5("");
    }
}
