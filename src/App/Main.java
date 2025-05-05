package App;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Data buku
        NonFiksi buku1 = new NonFiksi("PSYCHOLOGY OF MONEY", "Morgan Housel", "Finance & Psychology");
        Fiksi buku2 = new Fiksi("Legenda Danau Toba", "Rakyat Sumatera Utara", "Cerita Rakyat Nusantara");

        System.out.println("\n=== DAFTAR BUKU PERPUSTAKAAN ===\n");
        buku1.displayInfo();
        buku2.displayInfo();

        // Data anggota
        System.out.println("\n=== DAFTAR ANGGOTA PERPUSTAKAAN ===\n");
        Anggota anggota1 = new Anggota("Abex", "A188");
        Anggota anggota2 = new Anggota("Bila", "B031");

        anggota1.display();
        anggota2.display();

        // Proses peminjaman
        System.out.println("\n=== PEMINJAMAN BUKU ===\n");
        anggota1.pinjamBuku("PSYCHOLOGY OF MONEY");
        anggota2.pinjamBuku("Legenda Danau Toba", 7);

        // Proses pengembalian
        System.out.println("\n=== PENGEMBALIAN BUKU ===\n");
        anggota1.kembalikanBuku("PSYCHOLOGY OF MONEY");
        anggota2.kembalikanBuku("Legenda Danau Toba");
    }
}
