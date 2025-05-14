package Codelab.Modul_4.main;

import Codelab.Modul_4.users.*;

import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        admin admin1 = new admin("ridho", "212");
        mahasiswa mahasiswa1 = new mahasiswa("rendy", "176");

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Pilih jenis login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    admin1.login();
                    admin1.displaymenu();
                    break;
                case "2":
                    mahasiswa1.login();
                    mahasiswa1.displaymenu();
                    break;
                case "3":
                    System.out.println("Program keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (!choice.equals("3"));
        input.close();
    }
}
