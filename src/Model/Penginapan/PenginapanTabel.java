/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Penginapan;

import java.awt.image.PackedColorModel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class PenginapanTabel extends AbstractTableModel{
    
    List<ModelPenyewa> daftarPenyewa;
    
    String kolom[] = {"Nama", "Kontak", "Ruang Menginap", "Durasi Menginap", "Total Hartga", "Status"};
    
    public  PenginapanTabel(List<ModelPenyewa> penyewa){
        this.daftarPenyewa = penyewa;
    }
    @Override
    public int getRowCount() {
        return daftarPenyewa.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarPenyewa.get(rowIndex).getNama();
            case 1:
                return daftarPenyewa.get(rowIndex).getKontak();
            case 2:
                return daftarPenyewa.get(rowIndex).getRuang();
            case 3:
                return daftarPenyewa.get(rowIndex).getDurasi();
            case 4:
                return daftarPenyewa.get(rowIndex).getTotal_harga();
            case 5:
                return daftarPenyewa.get(rowIndex).getStatus();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int ColumnIndex){
        return kolom[ColumnIndex];
    }
    
}
