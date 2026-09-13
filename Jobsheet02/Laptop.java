package Jobsheet02;
public class Laptop {
    public String merek;
    public int ukuranRam;
    public int kapasitasStorage;

    public void displayInfo() {
        System.out.println("Merek   : " + merek);
        System.out.println("RAM     : " + ukuranRam + " GB");
        System.out.println("Storage : " + kapasitasStorage + " GB");
        System.out.println("---------------------------");
    }

    public int tambahRam(int tambah) {
        ukuranRam += tambah;
        return ukuranRam;
    }

    public int upgradeStorage(int tambah) {
        kapasitasStorage += tambah;
        return kapasitasStorage;
    }
}
