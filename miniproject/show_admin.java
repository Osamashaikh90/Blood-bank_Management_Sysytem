package com.miniproject;
import com.mysql.cj.xdevapi.PreparableStatement;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class show_admin {
    JFrame frame;
    JTable table;
    String host = "jdbc:mysql://localhost:3308/miniproject";
    String user = "root";
    String password = "";
    show_admin(){
        frame = new JFrame("Blood Bank Management System");
        Font text12 = new Font("Verdana", Font.BOLD, 12);
        table = new JTable();
        table.setForeground(Color.red);
        table.setFont(text12);
        table.setBounds(0, 0, 600, 400);
        try{
            Connection conn = DriverManager.getConnection(host, user, password);
            String query = "select * from admin";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception ee){
            System.out.println(ee);
        }
        frame.add(table);
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        show_admin s1 = new show_admin();
    }
}
