package Tugas;


 public class Mahasiswa {
    String nim, nama, kelas;
    public static void main(String[] args) {
        
       
        
        Mahasiswa x = new Mahasiswa();
        
        x.nim = "18090131";
        x.nama = "Tegar Prasetya";
        x.kelas = "4D";
        
        System.out.println("NIM : " + x.nim);
        System.out.println("Nama : " + x.nama);
        System.out.println("Kelas : " + x.kelas);
    }
    
}


