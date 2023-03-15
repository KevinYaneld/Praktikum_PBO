/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author KYC
 */
public class Pasien {
    String nama;
    String jenis_kelamin;
    int umur;
    String alamat;
    String keluhan;
    
    public Pasien(String nama,String jenis_kelamin,int umur,String alamat,String keluhan){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.umur = umur;
        this.alamat = alamat;
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


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}

class delete{
    int hapus;
    public delete(int Hapus){
        this.hapus = Hapus;
    }
}
