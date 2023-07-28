package com.attra.programs.java_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//1. import : java.sql
//2.load and register the driver -> com.mssql.jdbc.Driver
//3.Create Connection - Connection
public class JDBC_Connection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/db";
        String uname = "root";
        String pass = "Sharma@13";

//    String pass="";
        String query = "select * from shipping";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String string_name = rs.getString("order_no");

        System.out.println(string_name);
        st.close();
        con.close();

    }
}
