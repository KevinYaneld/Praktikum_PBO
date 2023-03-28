package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Pasien> pasien = new ArrayList<>();
    static ArrayList<Dokter> dokter = new ArrayList<>();
    
    
    public static void main(String[] args) throws IOException {
    while (true) {
            System.out.println("============================");
            System.out.println("|     Data Rumah Sakit     |");
            System.out.println("|1. Create Data            |");
            System.out.println("|2. Read Data              |");
            System.out.println("|3. Update Data            |");
            System.out.println("|4. Delete Data            |");
            System.out.println("|5. Exit                   |");
            System.out.println("============================");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    createData();
                    break;
                case 2:
                    System.out.println("============================");
                    System.out.println("|Data Yang Ingin Dilihat   |");
                    System.out.println("|1. Pasien                 |");
                    System.out.println("|2. Dokter                 |");
                    System.out.println("============================");
                    System.out.print("Masukan Pilihan Anda: ");
                    int pilih = Integer.parseInt(br.readLine());
                    switch (pilih) {
                    case 1 -> readData();
                    case 2 -> readDataDokter();
                    default -> System.out.println("Pilihan Tidak Tersedia");
                    }
                    break;
                    

                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }
    
        
    }
    
    public static void createData() throws IOException{
        System.out.println("============================");
        System.out.println("|Data Yang Ingin Ditambah  |");
        System.out.println("|1. Pasien                 |");
        System.out.println("|2. Dokter                 |");
        System.out.println("============================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilih = Integer.parseInt(br.readLine());
        switch (pilih) {
            case 1 -> {
                System.out.print("Masukkan Nama Pasien : ");
                String addNama = br.readLine();
                System.out.print("Masukkan Jenis Kelamin : ");
                String addJenis = br.readLine();
                System.out.print("Masukkan Umur : ");
                int addUmur = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat : ");
                String addAlamat = br.readLine();
                System.out.print("Masukkan Keluhan : ");
                String addKeluhan = br.readLine();
                System.out.print("\n");
                data_add(addNama, addJenis,addUmur,addAlamat,addKeluhan);
            }
            case 2 -> {
                System.out.print("Masukkan Nama Dokter : ");
                String addNamaDokter = br.readLine();
                System.out.print("Masukkan ID Dokter : ");
                String addID = br.readLine();
                System.out.print("Masukkan Jenis Kelamin : ");
                String addJenisDokter = br.readLine();
                System.out.print("Masukkan Umur : ");
                int addUmurDokter = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat : ");
                String addAlamatDokter = br.readLine();
                System.out.print("Masukkan Spesialis : ");
                String addSpesialis = br.readLine();
                System.out.print("\n");
//                Fungsi Overloading
                data_add(addNamaDokter,addJenisDokter,addUmurDokter,addAlamatDokter,addSpesialis,addID);
            }
            default -> System.out.println("Pilihan Tidak Tersedia");
        }
        
    }
    
    public static void readData() throws IOException{
        System.out.println("      DATA PASIEN      ");

        for (int i = 0; i < pasien.size(); i++) {
            System.out.println("Pasien Ke-" + (i+1));
            System.out.println("    Nama Pasien : " + pasien.get(i).getNama());
            System.out.println("    Jenis Kelamin : " + pasien.get(i).getJenis_kelamin());
            System.out.println("    Umur : " + pasien.get(i).getUmur());
            System.out.println("    Alamat : " + pasien.get(i).getAlamat());
            System.out.println("    Keluhan : " + pasien.get(i).getKeluhan());
            System.out.print("\n");
        }
    }
    
    public static void readDataDokter() throws IOException{
        System.out.println("      DATA Dokter     ");

        for (int i = 0; i < dokter.size(); i++) {
            System.out.println("Dokter Ke-" + (i+1));
            System.out.println("    Nama Dokter : " + dokter.get(i).getNama());
            System.out.println("    ID Dokter : " + dokter.get(i).getID_dokter());
            System.out.println("    Jenis Kelamin : " + dokter.get(i).getJenis_kelamin());
            System.out.println("    Umur : " + dokter.get(i).getUmur());
            System.out.println("    Alamat : " + dokter.get(i).getAlamat());
            System.out.println("    Spesialis : " + dokter.get(i).getSpesialis());
            System.out.print("\n");
        }
    }
    
    public static void updateData() throws IOException{
        System.out.println("============================");
        System.out.println("|Data Yang Ingin Diupdate  |");
        System.out.println("|1. Pasien                 |");
        System.out.println("|2. Dokter                 |");
        System.out.println("============================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilih = Integer.parseInt(br.readLine());
        switch (pilih) {
            case 1 -> {
                readData();
                System.out.println("UPDATE DATA PASIEN");
                System.out.print("Masukan Data Pasien ke- : ");
                int index = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Pasien : ");
                String updateNama = br.readLine();
                System.out.print("Masukkan Jenis Kelamin : ");
                String updateJenis = br.readLine();
                System.out.print("Masukkan Umur : ");
                int updateUmur = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat : ");
                String updateAlamat = br.readLine();
                System.out.print("Masukkan Keluhan : ");
                String updateKeluhan = br.readLine();
                System.out.print("\n");

                pasien.get(index-1).setNama(updateNama);
                pasien.get(index-1).setJenis_kelamin(updateJenis);
                pasien.get(index-1).setUmur(updateUmur);
                pasien.get(index-1).setAlamat(updateAlamat);
                pasien.get(index-1).setKeluhan(updateKeluhan);        

                pasien.get(index-1).update();
            }
            case 2 ->{
                readDataDokter();
                System.out.println("UPDATE DATA Dokter");
                System.out.print("Masukan Data Dokter ke- : ");
                int index = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Dokter : ");
                String updateNama = br.readLine();
                System.out.print("Masukkan ID Dokter : ");
                String updateID = br.readLine();
                System.out.print("Masukkan Jenis Kelamin : ");
                String updateJenis = br.readLine();
                System.out.print("Masukkan Umur : ");
                int updateUmur = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat : ");
                String updateAlamat = br.readLine();
                System.out.print("Masukkan Spesialis : ");
                String updateKeluhan = br.readLine();
                System.out.print("\n");
                
                dokter.get(index-1).setID_dokter(updateID);
                dokter.get(index-1).setNama(updateNama);
                dokter.get(index-1).setJenis_kelamin(updateJenis);
                dokter.get(index-1).setUmur(updateUmur);
                dokter.get(index-1).setAlamat(updateAlamat);
                dokter.get(index-1).setSpesialis(updateKeluhan);        

                dokter.get(index-1).update();
            }
        }
        
    }
    
    public static void deleteData() throws IOException{
        System.out.println("============================");
        System.out.println("|Data Yang Ingin Dihapus  |");
        System.out.println("|1. Pasien                 |");
        System.out.println("|2. Dokter                 |");
        System.out.println("============================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilih = Integer.parseInt(br.readLine());
        if (pilih == 1){
            readData();
            System.out.println("DELETE DATA PASIEN");
            System.out.print("Masukan Data Pasien ke-");
            int index = Integer.parseInt(br.readLine());
            pasien.remove(index-1);
        }else if(pilih == 2){
            readDataDokter();
            System.out.println("DELETE DATA DOKTER");
            System.out.print("Masukan Data Dokter ke-");
            int index = Integer.parseInt(br.readLine());
            dokter.remove(index-1);
        }
    }
    
    
//    FUNGSI OVERLOADING
    public static void data_add(String addNamaDokter,String addJenisDokter,int addUmurDokter,String addAlamatDokter,String addSpesialis,String addID) throws IOException{
        Dokter dokterBaru = new Dokter(addNamaDokter, addJenisDokter, addUmurDokter, addAlamatDokter, addSpesialis, addID);
        dokter.add(dokterBaru);
        dokterBaru.terdata();
    }
//    FUNGSI OVERLOADING   
    public static void data_add(String addNama,String addJenis,int addUmur,String addAlamat,String addKeluhan) throws IOException{
        Pasien pasienBaru = new Pasien(addNama, addJenis, addUmur, addAlamat, addKeluhan);
        pasien.add(pasienBaru);
        pasienBaru.terdata();
    }
    
}

