package org.java.jdbc;

import java.sql.*;

public class InsertMultipleRecords {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        //String qry = "insert into record.student values(102,'Raaz','raaz@gmail.com','Patna')";
        String qry = "insert into record.student values(?,?,?,?)";

        try{
            // 1st step :- Loading the class And Registering
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver Class is Loaded and Registered...!!");

            //2nd step :- Establish The Connection between Java Application to Database server
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            //System.out.println("Connection Establish Successfully....!!");

            //3rd step :- Create Platform
           pstmt = con.prepareStatement(qry);

           //Set the data
            pstmt.setInt(1,104);
            pstmt.setString(2,"Piya");
            pstmt.setString(3,"piya@gmail.com");
            pstmt.setString(4,"Jehanabad");

            //4th step :- Execute The Sql Query
            pstmt.executeUpdate();
            System.out.println("Recorded Added Successfully...!!");

        }catch(ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
        }
        finally {
            if(pstmt != null){
                try {
                    pstmt.close();
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
