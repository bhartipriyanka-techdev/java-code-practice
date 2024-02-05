package org.java.jdbc;

import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.Scanner;

public class FetchingRecordFromDB {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;;

        String qry = "select * from record.student";

        try{
            // 1st step :- Loading the class And Registering
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver Class is Loaded and Registered...!!");

            //2nd step :- Establish The Connection between Java Application to Database server
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
            //System.out.println("Connection Establish Successfully....!!");

            //3rd step :- Create Platform
            pstmt = con.prepareStatement(qry);

            System.out.println("-------------Record---------------");
            System.out.println("ID\tNAME\tEMAIL\tADDRESS");

            resultSet = pstmt.executeQuery();
            while(resultSet.next()){

                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String address = resultSet.getString(4);
                System.out.println(id+" "+name+" "+ email+" "+address);
        }


        }catch(ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
        }
        finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
