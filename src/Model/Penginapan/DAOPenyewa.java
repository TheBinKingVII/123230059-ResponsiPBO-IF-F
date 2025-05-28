/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Penginapan;
import Model.Admin.ModelAdmin;
import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Lab Informatika
 */
public class DAOPenyewa {
    public void insert(ModelPenyewa penyewa){
        try {
            String query = "INSERT INTO penyewa (nama, kontak, ruang, durasi, total_harga, status) VALUES (?,?,?,?,?,?);";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1, penyewa.getNama());
            statement.setString(2, penyewa.getKontak());
            statement.setString(3, penyewa.getRuang());
            statement.setInt(4, penyewa.getDurasi());
            statement.setInt(5, penyewa.getTotal_harga());
            statement.setString(6, penyewa.getStatus());
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            System.out.println("Input gagal" + e.getLocalizedMessage());
        }
    }
    
    public void delete(int id){
        try {
            String query = "DELETE FROM penyewa WHERE id=?";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            System.out.println("Hapus Gagal" + e.getLocalizedMessage());
        }
            
    }
    
    public List<ModelPenyewa> getAll(){
        List<ModelPenyewa> daftarPenyewa = null;
        
        try {
            daftarPenyewa = new ArrayList<>();
            Statement statement = Connector.Connect().createStatement();;
            
            String query = "SELECT * FROM penyewa;";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {                
                ModelPenyewa penyewa = new ModelPenyewa();
                
                penyewa.setId(resultSet.getInt("id"));
                penyewa.setNama(resultSet.getString("nama"));
                penyewa.setKontak(resultSet.getString("kontak"));
                penyewa.setRuang(resultSet.getString("ruang"));
                penyewa.setDurasi(resultSet.getInt("durasi"));
                penyewa.setTotal_harga(resultSet.getInt("total_harga"));
                penyewa.setStatus(resultSet.getString("status"));
                
                
                daftarPenyewa.add(penyewa);
            }
            
        } catch (Exception e) {
            System.out.println("Error" + e.getLocalizedMessage());
        }
        
        return daftarPenyewa;
    }
    
    
}
