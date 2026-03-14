/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aishw
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connect {
    public static void main(String[] args) {

       
        String url = "jdbc:mysql://localhost:3306/aishwarya";
        String user = "root";
        String password = "Root@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            
            Statement stmt = conn.createStatement();

            
            String query = "SELECT * FROM AI";
            ResultSet rs = stmt.executeQuery(query);

            
            while (rs.next()) {
                int id = rs.getInt("id");        
                String name = rs.getString("name"); 

                System.out.println("ID: " + id + ", Name: " + name);
            }

            

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
