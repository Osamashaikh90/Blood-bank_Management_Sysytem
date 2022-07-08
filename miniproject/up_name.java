package com.miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class up_name {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JTextField text;
    JButton update, back;
    String getid;
    up_name(String idd){
        frame = new JFrame("Blood Bank Management System");
        ImageIcon first = new
                ImageIcon(ClassLoader.getSystemResource("com/miniproject/img_7.png"));
        Image second = first.getImage().getScaledInstance(400, 400,
                Image.SCALE_DEFAULT);
        ImageIcon three = new ImageIcon(second);
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        JLabel picture = new JLabel(three);
        picture.setBounds(0, 0, 400, 400);
        panel = new JPanel();
        panel.setBounds(100, 100, 200, 200);
        panel.setOpaque(true);
        panel.setBackground(Color.red);
        panel.setLayout(null);
        label = new JLabel("Update Name");
        label.setBounds(70, 20, 100, 20);
        label.setForeground(Color.white);
        label.setFont(text12);
        text = new JTextField("");
        text.setBounds(50,55, 100, 20);
        text.setForeground(Color.red);
        text.setFont(text12);
        update = new JButton("Update");
        update.setOpaque(true);
        update.setBounds(50, 90, 100, 30);
        update.setBackground(Color.white);
        update.setForeground(Color.red);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    getid = text.getText();
                    if(getid.equals("")||getid.equals(" ")){
                        JOptionPane.showMessageDialog(null, "Invalid Entry");
                        return;
                    }
                    connection c = new connection();
                    String query = "update donor set donor_name='"+getid+"' where donor_id='"+idd+"';";
                    int hh = c.statement.executeUpdate(query);
                    if(hh>0){
                        JOptionPane.showMessageDialog(null, "Updated Successfully");
                        frame.setVisible(false);
                        (new Page3()).frame.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed.Try Again");
                    }
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        back = new JButton("BACK");
        back.setOpaque(true);
        back.setBounds(50, 135, 100, 30);
        back.setBackground(Color.white);
        back.setForeground(Color.red);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                (new up_buttons("")).frame.setVisible(true);
            }
        });
        panel.add(text);
        panel.add(label);
        panel.add(back);
        panel.add(update);
        frame.add(panel);
        frame.add(picture);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        up_name p = new up_name("");
    }
}
