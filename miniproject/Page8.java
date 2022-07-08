package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Page8 {
    JFrame frame;
    JLabel bank_id;
    JLabel bank_quantity;
    JLabel blood_type;
    JLabel donor_id;
    JLabel admin_id;
    JLabel lcn;
    JLabel la;
    JLabel ladid;
    JTextField idd,name,age,gender,bg,cn, ad, adid;
    JButton done,back;
    String getid, getname, getage, getgender, getbg, getcn, getad, getadid;
    Page8(){
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        frame = new JFrame("Blood Bank Management System");
        bank_id = new JLabel("BANK ID : ");
        bank_id.setBounds(20, 70, 100, 20);
        bank_id.setForeground(Color.red);
        bank_id.setFont(text12);
        Font head = new Font("Verdana", Font.BOLD, 16);
        JLabel heading = new JLabel("ADD BANK DETAILS");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(head);
        heading.setBounds(0, 0, 400, 50);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setForeground(Color.red);
        heading.setBackground(Color.white);
        bank_quantity = new JLabel("QUANTITY : ");
        bank_quantity.setBounds(20, 100, 100, 20);
        bank_quantity.setForeground(Color.red);
        bank_quantity.setFont(text12);
        blood_type = new JLabel("GROUP : ");
        blood_type.setBounds(20, 130, 100, 20);
        blood_type.setForeground(Color.red);
        blood_type.setFont(text12);
        donor_id = new JLabel("DONOR ID : ");
        donor_id.setBounds(20, 160, 100, 20);
        donor_id.setForeground(Color.red);
        donor_id.setFont(text12);
        admin_id = new JLabel("ADMIN ID : ");
        admin_id.setBounds(20, 190, 100, 20);
        admin_id.setForeground(Color.red);
        admin_id.setFont(text12);
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
                    if(getid.equals(" ") || getname.equals(" ") || getage.equals(" ") ||
                            getgender.equals(" ")|| getbg.equals(" ")){
                        JOptionPane.showMessageDialog(null, "Invalid Entries!!!");
                        return;
                    }
                    connection c = new connection();
                    String query = "insert into blood_bank values ('"+getid+"','"+getname+"', '"+getage+"', '"+getgender+"', '"+getbg+"');";
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
        frame.add(bank_id);
        frame.add(bank_quantity);
        frame.add(blood_type);
        frame.add(donor_id);
        frame.add(admin_id);
        frame.add(idd);
        frame.add(name);
        frame.add(age);
        frame.add(gender);
        frame.add(bg);
        frame.add(heading);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Page8 p8 = new Page8();
    }
}
