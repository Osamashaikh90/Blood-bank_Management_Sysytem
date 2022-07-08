package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
    Statement statement;
    connection() {
        String host = "jdbc:mysql://localhost:3308/miniproject";
        String user = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(host, user, password);
            statement = conn.createStatement();

        }catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        connection con = new connection();
    }
}
