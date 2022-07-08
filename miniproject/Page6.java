package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Page6 {
    JFrame frame;
    JLabel lid;
    JLabel lname;
    JLabel lage;
    JLabel lgender;
    JLabel lbg;
    JLabel lcn;
    JLabel la;
    JLabel ladid;
    JTextField idd,name,age,gender,bg,cn, ad, adid;
    JButton done,back;
    String getid, getname, getage, getgender, getbg, getcn, getad, getadid;
    Page6(){
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        frame = new JFrame("Blood Bank Management System");
        lid = new JLabel("ID : ");
        lid.setBounds(20, 70, 100, 20);
        lid.setForeground(Color.red);
        lid.setFont(text12);
        Font head = new Font("Verdana", Font.BOLD, 16);
        JLabel heading = new JLabel("ADD DONOR DETAILS");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        lname = new JLabel("NAME : ");
        lname.setBounds(20, 100, 100, 20);
        lname.setForeground(Color.red);
        lname.setFont(text12);
        lage = new JLabel("AGE : ");
        lage.setBounds(20, 130, 100, 20);
        lage.setForeground(Color.red);
        lage.setFont(text12);
        lgender = new JLabel("GENDER : ");
        lgender.setBounds(20, 160, 100, 20);
        lgender.setForeground(Color.red);
        lgender.setFont(text12);
        lbg = new JLabel("GROUP : ");
        lbg.setBounds(20, 190, 100, 20);
        lbg.setForeground(Color.red);
        lbg.setFont(text12);
        lcn = new JLabel("CONTACT : ");
        lcn.setBounds(20, 220, 100, 20);
        lcn.setForeground(Color.red);
        lcn.setFont(text12);
        la = new JLabel("ADDRESS : ");
        la.setBounds(20, 250, 100, 20);
        la.setForeground(Color.red);
        la.setFont(text12);
        ladid = new JLabel("ADMIN ID : ");
        ladid.setBounds(20, 280, 100, 20);
        ladid.setForeground(Color.red);
        ladid.setFont(text12);
        idd = new JTextField("");
        idd.setBounds(130, 70, 100, 20);
        idd.setForeground(Color.red);
        idd.setBorder(BorderFactory.createLineBorder(Color.red));
        idd.setFont(text12);
        name = new JTextField("");
        name.setBounds(130, 100, 100, 20);
        name.setForeground(Color.red);
        name.setBorder(BorderFactory.createLineBorder(Color.red));
        name.setFont(text12);
        age = new JTextField("");
        age.setBounds(130, 130, 100, 20);
        age.setForeground(Color.red);
        age.setBorder(BorderFactory.createLineBorder(Color.red));
        age.setFont(text12);
        gender = new JTextField("");
        gender.setBounds(130, 160, 100, 20);
        gender.setForeground(Color.red);
        gender.setBorder(BorderFactory.createLineBorder(Color.red));
        gender.setFont(text12);
        bg = new JTextField("");
        bg.setBounds(130, 190, 100, 20);
        bg.setForeground(Color.red);
        bg.setBorder(BorderFactory.createLineBorder(Color.red));
        bg.setFont(text12);
        cn = new JTextField("");
        cn.setBounds(130, 220, 100, 20);
        cn.setForeground(Color.red);
        cn.setBorder(BorderFactory.createLineBorder(Color.red));
        cn.setFont(text12);
        ad = new JTextField("");
        ad.setBounds(130, 250, 100, 20);
        ad.setForeground(Color.red);
        ad.setBorder(BorderFactory.createLineBorder(Color.red));
        ad.setFont(text12);
        adid = new JTextField("");
        adid.setBounds(130, 280, 100, 20);
        adid.setForeground(Color.red);
        adid.setBorder(BorderFactory.createLineBorder(Color.red));
        adid.setFont(text12);
        done = new JButton("DONE");
        done.setBounds(260, 120, 100, 30);
        done.setBackground(Color.red);
        done.setForeground(Color.white);
        done.setFont(text12);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    getid = idd.getText();
                    getname = name.getText();
                    getage = age.getText();
                    getgender = gender.getText();
                    getbg = bg.getText();
                    getcn = cn.getText();
                    getad = ad.getText();
                    getadid = adid.getText();
                    if(getid.equals(" ") || getname.equals(" ") || getage.equals(" ") ||
                            getgender.equals(" ")|| getbg.equals(" ")|| getcn.equals(" ")|| getad.equals(" ")||
                            getadid.equals(" ")){
                        JOptionPane.showMessageDialog(null, "Invalid Entries!!!");
                        return;
                    }
                    connection c = new connection();
                    String query = "insert into donor values ('"+getid+"','"+getname+"', '"+getage+"', '"+getgender+"', '"+getbg+"', '"+getcn+"', '"+getad+"', '"+getadid+"');";
                    int hh = c.statement.executeUpdate(query);
                    if(hh>0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        frame.setVisible(false);
                        (new Page3()).frame.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error Occur");
                    }
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        back = new JButton("BACK");
        back.setBounds(260, 160, 100, 30);
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        back.setFont(text12);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new Page3()).frame.setVisible(true);
            }
        });
        frame.add(done);
        frame.add(back);
        frame.add(lid);
        frame.add(lname);
        frame.add(lage);
        frame.add(lgender);
        frame.add(lbg);
        frame.add(lcn);
        frame.add(idd);
        frame.add(name);
        frame.add(age);
        frame.add(gender);
        frame.add(bg);
        frame.add(ad);
        frame.add(cn);
        frame.add(la);
        frame.add(heading);
        frame.add(ladid);
        frame.add(adid);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page6 p6 = new Page6();
    }
}
