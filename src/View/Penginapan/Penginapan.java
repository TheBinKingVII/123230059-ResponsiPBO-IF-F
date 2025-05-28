/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Penginapan;

/**
 *
 * @author Lab Informatika
 */

import Controller.ControllerAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Penginapan extends JFrame{
    Integer baris;
//    ControllerPenyewa controller;
    JLabel header = new JLabel("Data Penyewa");
    JButton tombolTambah = new JButton("Add");
    JButton tombolEdit = new JButton("Edit");
    JButton tombolHapus = new JButton("Delete0");
    JButton tombolClear = new JButton("Clear");
    
    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    
    
    String namakolom[] = {"Nama", "Kontak", "Ruang Menginap", "Durasi Menginap", "Total Hartga", "Status"};
    
    public Penginapan(){
        tableModel = new DefaultTableModel(namakolom, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        
        setTitle("Daftar Penyewa");
        setVisible(true);
        setSize(552, 580);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(header);
        add(tombolEdit);
        add(tombolHapus);
        add(tombolClear);
        add(tombolTambah);
        
        header.setBounds(20, 8, 440, 24);
        scrollPane.setBounds(20, 36, 512, 320);
        tombolTambah.setBounds(20, 370, 440, 24);
        tombolEdit.setBounds(20, 414, 440, 24);
        tombolHapus.setBounds(20, 458, 440, 24);
        tombolClear.setBounds(20, 502, 440, 24);
    }

    public JTable getJTablePenginapan() {
        return table;
    }

    
}
