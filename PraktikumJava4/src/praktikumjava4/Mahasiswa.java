/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumjava4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author Acer
 */
class Mahasiswa {
    Scanner in = new Scanner(System.in);

    ArrayList<String> DataNim = new ArrayList<>();
    ArrayList<String> DataNama = new ArrayList<>();
    ArrayList<Date> DataTtl = new ArrayList<>();
    ArrayList<Integer> DataGender = new ArrayList<>();
    String nim,nama,tang;
    Date ttl;
    int gender, index = 0;
        
    SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
    void menu() throws ParseException {
        while (true) {
            System.out.println("==============================================");
            System.out.println("Menu: \n[1] Menambah Data \n[2] Menghapus Data \n[3] Mencari Data \n[4] Menampilkan Data \n[5] Exit");
            System.out.println("Masukan Nomor pilihan Anda");
            System.out.println("==============================================");
            int pilih = in.nextInt();
            System.out.println(" ");
            System.out.println("----------------------------------------------");
            if (pilih==1) {
                this.tambah();
            }else if (pilih==2){
                this.hapus();
            }else if (pilih==3){
                this.cari();
            }else if (pilih==4){
                this.tampil();
            }else if (pilih==5){
                this.keluar();
                break;
            }else{
                System.out.println("----------------------------------------------");
                System.out.println("Perintah yang Anda masukan salah!!!");
                System.out.println("----------------------------------------------");
                break;
                    
            }
        }
    }void tambah() throws ParseException{
        System.out.println("Tambah Data");
        in.nextLine();
        System.out.println("----------------------------------------------");
        System.out.print("Nim\t: " );
        DataNim.add(in.nextLine());
        System.out.print("Name\t: " );
        DataNama.add(in.nextLine());
        System.out.print("Born\t(dd/mm/yyyy): " );
        tang=in.nextLine();
        ttl=format.parse(tang);
        DataTtl.add(ttl);
        System.out.println("----------------------------------------------");
        System.out.print("Pilih gender:\n[0]Laki-Laki \n[1]Perempuan \nMasukan Angkanya: " );
        DataGender.add(in.nextInt());
        System.out.println("----------------------------------------------");
        System.out.println(" ");
    }void hapus(){
        System.out.println("Menghapus Data");
        in.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println("MASUKAN NIM ");
        String hapus = in.nextLine();
        DataNim.indexOf(hapus);
        DataNim.remove(index);
        DataNama.remove(index);
        DataTtl.remove(index);
        DataGender.remove(index);
        System.out.println("----------------------------------------------");
    }void cari(){
        System.out.println("Mencari Data");
        in.nextLine();
        System.out.println("----------------------------------------------");
        System.out.println("Beradasarkan: \n[1] NIM \n[2] Gender");
        System.out.println("Masukan Nomor pilihan Anda");
        System.out.println("==============================================");
        int pilihan = in.nextInt();
        if(pilihan==1){
            System.out.println("Berdasarkan Nim ");
            in.nextLine();
            System.out.println("----------------------------------------------");
            System.out.print("Masukan Nim :");
            String nims = in.nextLine();
            System.out.println(" ");
            DataNim.indexOf(nims);
            String Lp = (DataGender.get(index)==0)? "Laki-Laki":"Perempuan";
            System.out.println("Nim     : "+ DataNim.get(index));
            System.out.println("Nama    : "+ DataNama.get(index));
            System.out.println("TTL     : "+ DataTtl.get(index));
            System.out.println("Gender  : "+ DataGender.get(index)+Lp);
            System.out.println("----------------------------------------------");
            System.out.println(" ");
                        
        }if (pilihan==2){
            System.out.println("Berdasarkan Gender \n[0]Laki-Laki \n[1]Perempuan ");
            in.nextLine();
            System.out.println("----------------------------------------------");
            System.out.print("Masukan Angkanya:");
            int genders = in.nextInt();
            DataGender.indexOf(genders);
            String Lp = (DataGender.get(index)==0)? "Laki-Laki":"Perempuan";
                        
            System.out.println("Gender  : "+ Lp);
            System.out.println("Nim     : "+ DataNim.get(index));
            System.out.println("Nama    : "+ DataNama.get(index));
            System.out.println("TTL     : "+ DataTtl.get(index));
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }
    }void tampil(){
        System.out.println("Menampilkan Data");
        in.nextLine();
        System.out.println("----------------------------------------------");
        if (DataNim.isEmpty()){
            System.out.println("Tidak Ada Data Mahasiswa");
            System.out.println(" ");
        }else{
            for (int i=0; i<DataNim.size(); i++){
                String Lp = (DataGender.get(i)==0)? "Laki-Laki":"Perempuan";
                System.out.println("Nim     : "+ DataNim.get(i));
                System.out.println("Nama    : "+ DataNama.get(i));
                System.out.println("TTL     : "+ DataTtl.get(i));
                System.out.println("Gender  : " +  Lp);
            }
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("Jumah Mahasiswa \t: "+ DataNim.size());
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        } 
    }void keluar(){
        System.out.println("Exit !!!");
        System.out.println("----------------------------------------------");
        
    }
    
}
