package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleRecordsInDyn {
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
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many Records you want to Insert : ");
            int count = scanner.nextInt();
            for(int i= 0; i< count ; i++){
                System.out.print("Enter Id : ");
                int id = scanner.nextInt();
                pstmt.setInt(1,id);
                System.out.print("Enter Name : ");
                String name = scanner.next();
                pstmt.setString(2,name);
                System.out.print("Enter Email : ");
                String email = scanner.next();
                pstmt.setString(3,email);
                System.out.print("Enter Address : ");
                String address = scanner.next();
                pstmt.setString(4,address);

                //4th step :- Execute The Sql Query
                pstmt.executeUpdate();

            }
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
