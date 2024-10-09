/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.humanresource.Product;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duong Minh Quyen
 */
public class ProductDBContext extends DBContext<Product> {

    public ArrayList<Product> list() {
        ArrayList<Product> prods = new ArrayList<>();
        PreparedStatement stm = null;
        String sql = "select prid, prname, estimatehour\n"
                + "from Product";
        try {
            stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
