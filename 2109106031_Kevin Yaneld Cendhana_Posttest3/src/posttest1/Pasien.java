/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author KYC
 */
public class Pasien extends RumahSakit {
    private String keluhan;
    
    public Pasien(String nama,String jenis_kelamin,int umur,String alamat,String keluhan){
        super(nama, jenis_kelamin, umur, alamat);
        this.keluhan = keluhan;
        
    }
    
    public void terdata(){
        System.out.println("Anda Dengan Nama, " + this.getNama());
        System.out.println("Jenis Kelamin : " + this.getJenis_kelamin());
        System.out.println("Umur : " + this.getUmur());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Keluhan : " + this.getKeluhan());
        System.out.println("Telah Terdata Menjadi Pasien");
        System.out.print("\n");
    }
    
    public void update(){
        System.out.println("Anda Dengan Nama, " + this.getNama());
        System.out.println("Jenis Kelamin : " + this.getJenis_kelamin());
        System.out.println("Umur : " + this.getUmur());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Keluhan : " + this.getKeluhan());
        System.out.println("Telah Terupdate");
        System.out.print("\n");
    }


    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}