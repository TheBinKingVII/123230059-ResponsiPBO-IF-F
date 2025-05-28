/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Penginapan.*;
import Model.Admin.DAOAdmin;
import Model.Admin.InterfaceDAOAdmin;
import Model.Admin.ModelAdmin;
import View.Login.*;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public class ControllerAdmin {
    Login login;
    
    InterfaceDAOAdmin dAOAdmin;
    List<ModelAdmin> daftarAdmin;
    
    public ControllerAdmin(Login halamanLogin){
        this.login = halamanLogin;
        this.dAOAdmin = new DAOAdmin();
    }
    
    public void loginuser(){
        try {
            
            daftarAdmin = dAOAdmin.getAll();
            ModelAdmin admin = new ModelAdmin();
            
            String username = login.getinputUsername();
            String password = login.getinputPassword();
            
            if ("".equals(username) || "".equals(password)) {
                throw new Exception("username atau password tidak boleh kosong");
                
            }else {
                for(ModelAdmin admins : daftarAdmin){
                    if (admins.getUsername().equals(username) && admins.getPassword().equals(password)) {
                        System.out.println("Berhasil Login");
                       
                        login.dispose();
                         new Penginapan();
                        
                    }
                }
            }
            
            
        } catch (Exception e) {
        }
    }
}
