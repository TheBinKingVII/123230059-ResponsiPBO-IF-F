/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Admin;

import Model.Connector;
import java.util.List;
import java.sql.*;

import java.util.ArrayList;

/**
 *
 * @author Lab Informatika
 */
public class DAOAdmin implements InterfaceDAOAdmin{
    @Override
    public List<ModelAdmin> getAll(){
        List<ModelAdmin> daftarAdmin = null;
        
        try {
            daftarAdmin = new ArrayList<>();
            Statement statement = Connector.Connect().createStatement();;
            
            String query = "SELECT * FROM admin;";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {                
                ModelAdmin admin = new ModelAdmin();
                
                admin.setId(resultSet.getInt("id"));
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
                
                daftarAdmin.add(admin);
            }
            
        } catch (Exception e) {
            System.out.println("Error" + e.getLocalizedMessage());
        }
        
        return daftarAdmin;
    }
}
