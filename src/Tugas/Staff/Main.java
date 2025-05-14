package Staff;

class Staff {
    protected String nama;
    protected String alamat;
    protected double gajiPokok;
    protected double tunjangan;
    protected int level;

    // Constructor
    public Staff(String nama, String alamat, double gajiPokok, double tunjangan, int level) {
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.level = level;
    }

    // Methods
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getLevel() {
        return level;
    }

    // Method untuk menghitung gaji
    public double bayarGaji() {
        return gajiPokok + tunjangan;
    }
}

// class Manager (Subclass dari Staff)
class Manager extends Staff {
    // Constructor Manager, dari Staff
    public Manager(String nama, String alamat, double gajiPokok, double tunjangan, int level) {
        super(nama, alamat, gajiPokok, tunjangan, level);
    }

    // Method untuk menghitung gaji Manager berdasarkan level
    public double bayarManager() {
        double bonus = 0;
        if (level == 1) {
            bonus = 3000;
        } else if (level == 2) {
            bonus = 4000;
        } else if (level == 3) {
            bonus = 5000;
        }
        return bayarGaji() + bonus;
    }

    // Method untuk mencetak informasi Manager
    public void cetakInfo() {
        System.out.println("Manager " + nama + ", Alamat: " + alamat);
        System.out.println("Gaji diterima Rp " + bayarManager());
    }
}

class Direktur extends Staff {
    private char kodeDir;

    // Constructor Direktur, dari Staff
    public Direktur(String nama, String alamat, double gajiPokok, double tunjangan, char kodeDir) {
        super(nama, alamat, gajiPokok, tunjangan, 0);
        this.kodeDir = kodeDir;
    }

    // Getter untuk kode direktur
    public char getKodeDir() {
        return kodeDir;
    }

    // Method untuk menghitung gaji Direktur berdasarkan kodeDir
    public double bayarDirektur() {
        double bonus = 0;
        if (kodeDir == 'A') {
            bonus = 1000000;
        } else if (kodeDir == 'B') {
            bonus = 2000000;
        } else if (kodeDir == 'C') {
            bonus = 3000000;
        }
        return bayarGaji() + bonus;
    }

    public void cetakInfo() {
        System.out.println("Direktur " + nama + ", Alamat: " + alamat);
        System.out.println("Gaji diterima Rp " + bayarDirektur());
    }
}

public class Main {
    public static void main(String[] args) {
        // Contoh Manager
        Manager manajer = new Manager("Prasetyo", "Jl. Kaliurang 31 Malang", 2000000, 500000, 2);
        manajer.cetakInfo();

        System.out.println();

        // Contoh Direktur
        Direktur direktur = new Direktur("Prasetyo", "Jl. Bunga Merak 5 Malang", 2500000, 500000, 'A');
        direktur.cetakInfo();
    }
}