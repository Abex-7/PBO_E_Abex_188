package Codelab.Modul_1;

import java.util.Scanner;
import java.time.LocalDate;

public class Codelab {
    public static void main(String[] args) {
        // Rumus menghitung tahun sekarang
        int tahunSekarang = LocalDate.now().getYear();

        // Dekralasi Variable
        String firstname;
        String kelamin;
        int lahir;

        // Pengambilan Menggunakan Scanner yang menjadi inputan user
        Scanner objInput = new Scanner(System.in);

        // input dari nama user
        System.out.print("masukkan Nama : ");
        firstname = objInput.nextLine();

        // Input dari jenis kelamin user
        System.out.print("masukkan kelamin anda (P/L) :");
        kelamin = objInput.nextLine();

        // Input dari tahun lahir user
        System.out.print("Masukkan tahun lahir : ");
        lahir = objInput.nextInt();

        // Menghitung umur dari lahir s/d sekarang
        lahir = tahunSekarang - lahir;

        // Pengecualian Jika (P/L)
        String jeniskelamin;
        if (kelamin.equalsIgnoreCase("P")) {
            jeniskelamin = "perempuan";
        } else if (kelamin.equalsIgnoreCase("L")) {
            jeniskelamin = "laki-laki";
        } else {
            jeniskelamin = "tidak diketahui";
        }

        // Menampilkan Output
        System.out.println("\nData Diri: ");
        System.out.println("Nama : " + firstname);
        System.out.println("jenis kelamin : " + jeniskelamin);
        System.out.println("umur : " + lahir + "tahun");

        // menutup Scanner
        objInput.close();
    }
}