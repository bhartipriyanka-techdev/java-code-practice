package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        String qry = "delete from record.student where id = 102";

        try {

            //Load The Driver cLass
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Class is Loaded and Registered...!!");


            //Establish The Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection Establish Successfully....!!");

            //Create Platform
            stmt = con.createStatement();

            //Execute SQL statements
            int value = stmt.executeUpdate(qry);
            System.out.println("How many Record is Affected :"+value);
            System.out.println("Record Deleted Successfully..!");

            //Create Sql Statement
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("All Costly Resources Closed");
        }
    }
}
