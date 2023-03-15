package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Pasien> pasien = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
    while (true) {
            System.out.println("============================");
            System.out.println("|Data Pasien Rumah Sakit   |");
            System.out.println("|1. Create Data Pasien     |");
            System.out.println("|2. Read Data Pasien       |");
            System.out.println("|3. Update Data Pasien     |");
            System.out.println("|4. Delete Data Pasien     |");
            System.out.println("|5. Exit                   |");
            System.out.println("============================");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    createPasien();
                    break;
                case 2:
                    readPasien();
                    break;
                case 3:
                    updatePasien();
                    break;
                case 4:
                    deletePasien();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }
    
        
    }
    
    public static void createPasien() throws IOException{
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
        Pasien pasienBaru = new Pasien(addNama, addJenis, addUmur, addAlamat, addKeluhan); 

        pasien.add(pasienBaru);

        pasienBaru.terdata();
    }
    
    public static void readPasien() throws IOException{
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
    
    public static void updatePasien() throws IOException{

        readPasien();

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
    
    public static void deletePasien() throws IOException{
        readPasien();
        System.out.println("DELETE DATA PASIEN");
        System.out.print("Masukan Data Pasien ke-");
        int index = Integer.parseInt(br.readLine());
        delete del = new delete(index-1);
        pasien.remove(del.hapus);
        
    }
}

