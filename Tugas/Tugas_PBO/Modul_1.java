package Tugas.Tugas_PBO;

import java.util.Scanner;

public class Modul_1 {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        int Pilihan;
        boolean ulang = true;

        do {
            System.out.println("Pilih Login : \n");
            System.out.println("1. Admin\n");
            System.out.println("2. Mahasiswa\n");
            System.out.print("Masukkan Pilihan :");
            Pilihan = objinput.nextInt();
            objinput.nextLine();

            if (Pilihan == 1) {
                System.out.println("\n=== Login Admin ===");
                boolean LoginAdminBerhasil = false;
                do {
                    System.out.println("Masukkan Username : ");
                    String username = objinput.nextLine();
                    System.out.println("Masukkan Password : ");
                    String password = objinput.nextLine();

                    if (username.equals("admin188") && password.equals("password188")) {
                        System.out.println("Login Admin berhasil");
                        LoginAdminBerhasil = true;
                        ulang = false;
                    } else {
                        System.out.println("Login Gagal! Username atau Password salah.");
                    }
                } while (!LoginAdminBerhasil);

            } else if (Pilihan == 2) {
                System.out.println("\n=== Login Mahasiswa ===");
                boolean LoginMahasiswaBerhasil = false;

                do {
                    System.out.println("Masukkan Nama :");
                    String nama = objinput.nextLine();
                    System.out.println("Masukkan nim :");
                    String nim = objinput.nextLine();

                    if (nama.equals("muhammad abiyyu") && nim.equals("202410370110188")) {
                        System.out.println("Login Mahasiswa Berhasil");
                        System.out.println("Nama : " + nama);
                        System.out.println("Nim : " + nim);
                        LoginMahasiswaBerhasil = true;
                        ulang = false;
                    } else {
                        System.out.println("Login Gagal! Nama atau Nim salah.");
                    }
                } while (!LoginMahasiswaBerhasil);
            } else {
                System.out.println("Pilihan Tidak Valid!");
            }

        } while (ulang);

        objinput.close();
    }
}
