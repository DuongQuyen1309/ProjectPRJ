/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Duong Minh Quyen
 */
//jdbc:sqlserver://localhost\SQLEXPRESS:1433;databaseName=ProjectPRJ;encrypt=true;trustServerCertificate=true; 
public abstract class DBContext<T> {
    protected Connection connection;
    public DBContext(){
        try {
            String user = "quyenduong";
            String pass = "quyenduong";
            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=ProjectPRJ;trustServerCertificate=true;";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
