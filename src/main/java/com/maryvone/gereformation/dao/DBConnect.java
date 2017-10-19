package com.maryvone.gereformation.dao;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class DBConnect {


    private static Connection conn = null;
    final static String URL = "jdbc:mysql://localhost:3306/GereFormation";

    public static Connection getConnection() {

        if (conn == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();


            

                conn = DriverManager.getConnection(URL, "*login*", "*password*");//replace by your password and user from PHPmyAdmin


            } catch (SQLException sqlE) {
                System.out.println("Sql Erreur " + sqlE.getMessage());
                throw new RuntimeException();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}
