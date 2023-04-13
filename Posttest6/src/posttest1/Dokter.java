/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;


public final class Dokter extends RumahSakit{
    private String spesialis;
    private String ID_dokter;
    
    
    public Dokter(String nama,String jenis_kelamin,int umur,String alamat,String spesialis, String ID_dokter){
        super(nama, jenis_kelamin, umur, alamat);
        this.spesialis = spesialis;
        this.ID_dokter = ID_dokter;
}
//    FUNGSI OVERRIDING 
    @Override
    public void terdata(){
    System.out.println("Dokter Dengan Nama, " + this.getNama());
    System.out.println("ID : " + this.getID_dokter());
    System.out.println("Jenis Kelamin : " + this.getJenis_kelamin());
    System.out.println("Umur : " + this.getUmur());
    System.out.println("Alamat : " + this.getAlamat());
    System.out.println("Spesialis : " + this.getSpesialis());
    System.out.println("Telah Terdata");
    System.out.print("\n");
    }
//    FUNGSI OVERRIDING 
    @Override
    public void update(){
        System.out.println("Dokter Dengan Nama, " + this.getNama());
        System.out.println("ID : " + this.getID_dokter());
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

    public String getID_dokter() {
        return ID_dokter;
    }

    public void setID_dokter(String ID_dokter) {
        this.ID_dokter = ID_dokter;
    }
}
