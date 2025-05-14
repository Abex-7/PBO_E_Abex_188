package Codelab.Modul_4.users;

import Codelab.Modul_4.actions.*;
import Codelab.Modul_4.actions.adminActions;
import Codelab.Modul_4.actions.mahasiswaActions;
import java.util.ArrayList;
import java.util.Scanner;

public class mahasiswa extends userLogin implements mahasiswaActions {

    private ArrayList<String> reports = new ArrayList<>();

    public mahasiswa(String userName, String userPassw) {
        super(userName, userPassw);
    }

    @Override
    public void reportitem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String itemName = scanner.nextLine();
        System.out.println("Deskripsi Barang: ");
        String itemDescription = scanner.nextLine();
        System.out.println("Lokasi terakhir: ");
        String itemLocation = scanner.nextLine();

        String report = "Item: " + itemName + ", Deskripsi: " + itemDescription + ", Lokasi: " + itemLocation;
        reports.add(report);

        System.out.println("Laporan telah diterima.");
    }

    @Override
    public void viewReportedItems() {
        if (reports.isEmpty()) {
            System.out.println(">> Tidak ada laporan yang tersedia <<");
        } else {
            System.out.println("Laporan yang dilaporkan:");
            for (String report : reports) {
                System.out.println(report);
            }
        }
    }

    @Override
    public void login() {
        System.out.println("Login sebagai Mahasiswa");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(this.userName) && password.equals(this.userPassw)) {
            System.out.println("Login berhasil! Selamat datang " + this.userName + "!");
        } else {
            System.out.println("Nama atau password salah.");
        }
    }

    @Override
    public void displaymenu() {
        System.out.println("Mahasiswa Menu: \n1. Report Item\n2. View Reported Items\n3. Logout");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                reportitem();
                break;
            case "2":
                viewReportedItems();
                break;
            case "3":
                System.out.println("Logout berhasil!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
