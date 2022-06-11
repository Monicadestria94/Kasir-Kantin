/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection mysql_koneksi;
    public static Connection koneksi_db() throws SQLException{
        if (mysql_koneksi==null){
            try{
                String db = "jdbc:mysql://localhost:3306/kasir";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysql_koneksi=(Connection) DriverManager.getConnection(db,user,pass);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "gagal");
            }
        }
        return mysql_koneksi;
    }
}
