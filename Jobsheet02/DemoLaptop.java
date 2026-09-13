package Jobsheet02;
public class DemoLaptop {
    public static void main(String[] args) {
        // 1. Instansiasi 2 Objek
        Laptop laptop1 = new Laptop();
        laptop1.merek = "MacBook Air";
        laptop1.ukuranRam = 8;
        laptop1.kapasitasStorage = 256;

        Laptop laptop2 = new Laptop();
        laptop2.merek = "Asus TUF";
        laptop2.ukuranRam = 16;
        laptop2.kapasitasStorage = 512;

        System.out.println("=== Kondisi Awal ===");
        laptop1.displayInfo();
        laptop2.displayInfo();

        // 2. Update nilai atribut & eksekusi method
        laptop1.tambahRam(8);
        laptop1.upgradeStorage(256);

        laptop2.tambahRam(16);
        laptop2.upgradeStorage(512);

        System.out.println("=== Setelah Di Upgrade ===");
        laptop1.displayInfo();
        laptop2.displayInfo();
    }
}
