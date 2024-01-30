package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        String qry = "insert into record.student values(102,'Raaz','raaz@gmail.com','Patna')";

        try{
            // 1st step :- Loading the class And Registering
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Class is Loaded and Registered...!!");

            //2nd step :- Establish The Connection between Java Application to Database server
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            System.out.println("Connection Establish Successfully....!!");

            //3rd step :- Create Platform
            stmt = con.createStatement();
            System.out.println("Platform Created Successfully..!!");

            //4th step :- Execute The Sql Query
            stmt.executeUpdate(qry);
            System.out.println("Recorded Added Successfully...!!");

        }catch(ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
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
