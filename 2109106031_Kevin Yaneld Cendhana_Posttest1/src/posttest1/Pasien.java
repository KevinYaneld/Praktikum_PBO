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
        System.out.println("Anda Dengan Nama, " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenis_kelamin);
        System.out.println("Umur : " + this.umur);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Keluhan : " + this.keluhan);
        System.out.println("Telah Terdata Menjadi Pasien");
        System.out.print("\n");
    }
    
    public void update(){
        System.out.println("Anda Dengan Nama, " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenis_kelamin);
        System.out.println("Umur : " + this.umur);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Keluhan : " + this.keluhan);
        System.out.println("Telah Terupdate");
        System.out.print("\n");
    }
}

class delete{
    int hapus;
    public delete(int Hapus){
        this.hapus = Hapus;
    }
}
