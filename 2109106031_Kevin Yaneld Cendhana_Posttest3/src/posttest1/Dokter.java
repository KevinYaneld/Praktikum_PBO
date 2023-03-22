/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;


public class Dokter extends RumahSakit{
    private String spesialis;
    
    
    public Dokter(String nama,String jenis_kelamin,int umur,String alamat,String spesialis){
        super(nama, jenis_kelamin, umur, alamat);
        this.spesialis = spesialis;
}

        public void terdata_dokter(){
        System.out.println("Anda Dengan Nama, " + this.getNama());
        System.out.println("Jenis Kelamin : " + this.getJenis_kelamin());
        System.out.println("Umur : " + this.getUmur());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Spesialis : " + this.getSpesialis());
        System.out.println("Telah Terdata Menjadi Dokter");
        System.out.print("\n");
    }
    
    public void update_dokter(){
        System.out.println("Anda Dengan Nama, " + this.getNama());
        System.out.println("Jenis Kelamin : " + this.getJenis_kelamin());
        System.out.println("Umur : " + this.getUmur());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("Spesialis : " + this.getSpesialis());
        System.out.println("Telah Terupdate");
        System.out.print("\n");
    }
    
    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
