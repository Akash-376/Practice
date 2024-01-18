package com.masai.initializingAndDisposingBean;

import java.sql.*;

public class AA {

    private String url;
    private String driverName;
    private String username;
    private String password;

    private Connection conn;
    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void mySetup(){
        System.out.println("Inside setup method");

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void destroy(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Inside destroy method");

    }
    public void funA(){
        System.out.println("Inside funA of AA");
        System.out.println("we got the connection and we can perform the DB operation");
        System.out.println(conn);
    }

}
