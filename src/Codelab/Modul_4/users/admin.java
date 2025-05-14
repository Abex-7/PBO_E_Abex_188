package Codelab.Modul_4.users;

import java.util.Scanner;
import Codelab.Modul_4.actions.*;
import Codelab.Modul_4.actions.adminActions;
import Codelab.Modul_4.actions.mahasiswaActions;

public class admin extends userLogin implements adminActions {
    public admin(String userName, String userPassw) {
        super(userName, userPassw);
    }

    @Override
    public void login() {
        System.out.println("Login as Admin");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (username.equals(this.userName) && password.equals(this.userPassw)) {
            System.out.println("Login successful!" + this.userName + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    @Override
    public void displaymenu() {
        System.out.println("Admin Menu: \n1. View Users\n2. Manage Users\n3. Logout");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan pilihan: ");
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            viewUsers();
        } else if (choice.equals("2")) {
            manageUsers();
        } else if (choice.equals("3")) {
            System.out.println("program keluar");
        } else {
            System.out.println("pilihan tidak valid.");
        }
    }

    @Override
    public void manageUsers() {
        System.out.println("Admin cannot report items.");
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void viewUsers() {
        System.out.println("Viewing reported items.");
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}
