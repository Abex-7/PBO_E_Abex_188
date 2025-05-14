package Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exception.StokTidakCukupException;
import Entity.Barang;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    try {
                        System.out.print("Masukkan nama barang: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan stok awal: ");
                        int stok = scanner.nextInt();
                        scanner.nextLine(); // konsumsi newline
                        daftarBarang.add(new Barang(nama, stok));
                        System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                    } catch (InputMismatchException e) {
                        System.out.println("Stok harus berupa angka!");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                    } else {
                        System.out.println("===== Daftar Barang =====");
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang b = daftarBarang.get(i);
                            System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                        }
                    }
                    break;

                case 3:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Tidak ada barang untuk dikurangi.");
                        break;
                    }

                    System.out.println("===== Daftar Barang (Kurangi Stok) =====");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }

                    try {
                        System.out.print("Masukkan nomor indeks barang: ");
                        int indeks = scanner.nextInt();
                        Barang barangDipilih = daftarBarang.get(indeks);

                        System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
                        int jumlahDiambil = scanner.nextInt();
                        scanner.nextLine(); // konsumsi newline

                        if (jumlahDiambil > barangDipilih.getStok()) {
                            throw new StokTidakCukupException("Stok untuk " + barangDipilih.getNama() +
                                    " hanya tersisa " + barangDipilih.getStok());
                        }

                        barangDipilih.setStok(barangDipilih.getStok() - jumlahDiambil);
                        System.out.println("Stok barang '" + barangDipilih.getNama()
                                + "' berhasil dikurangi. Sisa stok: " + barangDipilih.getStok());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (StokTidakCukupException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Terima kasih! Program berakhir.");
                    break;

                default:
                    System.out.println("Opsi tidak tersedia.");
            }
        }

        scanner.close();
    }
}