public class Mahasiswa extends User{
    // Constructor menggunakan supe

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Mahasiswa");
        System.out.println("Login berhasil sebagai Mahasiswa!");
    }
}
