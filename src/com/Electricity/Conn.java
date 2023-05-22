package com.Electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conn {
    Connection con = null;
    Statement st = null;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "12345");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
