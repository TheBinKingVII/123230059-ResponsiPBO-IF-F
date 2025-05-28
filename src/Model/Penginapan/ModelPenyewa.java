/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Penginapan;

/**
 *
 * @author Lab Informatika
 */
public class ModelPenyewa {
    private Integer id;
    private String nama;
    private String kontak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    public Integer getDurasi() {
        return durasi;
    }

    public void setDurasi(Integer durasi) {
        this.durasi = durasi;
    }

  
    private String ruang;
    private Integer durasi;
    private Integer total_harga;

    public Integer getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Integer total_harga) {
        this.total_harga = total_harga;
    }
    
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
