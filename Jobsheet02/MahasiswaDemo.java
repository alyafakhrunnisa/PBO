package Jobsheet02;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        // Soal no 12
        System.out.println("-------------------------------");
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Rizky Maulana";
        m2.alamat = "Medan, Sumatera Utara";
        m2.kelas = "2B";
        m2.displayBiodata();

        System.out.println("-------------------------------");
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Dewi Lestari";
        m3.alamat = "Jakarta, DKI Jakarta";
        m3.kelas = "2C";
        m3.displayBiodata();
    }
}
