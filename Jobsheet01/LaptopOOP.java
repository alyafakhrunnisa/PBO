package Jobsheet01;

// Class blueprint untuk entitas Laptop
class Laptop {
    // Atribut / State
    private String merek;
    private int ramGB;
    private double hargaJuta;

    // Constructor untuk inisialisasi data objek
    public Laptop(String merek, int ramGB, double hargaJuta) {
        this.merek = merek;
        this.ramGB = ramGB;
        this.hargaJuta = hargaJuta;
    }

    // Behavior 1: Menambahkan kapasitas RAM
    public void tambahRAM(int tambahan) {
        this.ramGB += tambahan;
    }

    // Behavior 2: Menghitung dan mengubah harga setelah diskon
    public void diskonHarga(double persenDiskon) {
        double potongan = this.hargaJuta * (persenDiskon / 100);
        this.hargaJuta -= potongan;
    }

    // Behavior 3: Menampilkan informasi laptop
    public void tampilkan() {
        System.out.println("Merek  : " + this.merek);
        System.out.println("RAM    : " + this.ramGB + " GB");
        System.out.println("Harga  : Rp " + this.hargaJuta + " juta");
        System.out.println("-------------------------------");
    }
}

// Main Class
public class LaptopOOP {
    public static void main(String[] args) {
        // Instansiasi 10 Objek Laptop
        Laptop lp1 = new Laptop("Asus", 8, 9.5);
        Laptop lp2 = new Laptop("Acer", 4, 6.0);
        Laptop lp3 = new Laptop("Lenovo", 16, 12.0);
        Laptop lp4 = new Laptop("HP", 8, 8.7);
        Laptop lp5 = new Laptop("Dell", 16, 14.5);
        Laptop lp6 = new Laptop("MSI", 16, 18.0);
        Laptop lp7 = new Laptop("Apple MacBook", 8, 21.0);
        Laptop lp8 = new Laptop("Axioo", 4, 5.5);
        Laptop lp9 = new Laptop("Samsung", 8, 10.2);
        Laptop lp10 = new Laptop("Razer", 32, 35.0);

        // Eksekusi method tambahRAM() dan diskonHarga() langsung pada objek
        lp1.tambahRAM(8);
        lp1.diskonHarga(10);

        lp2.tambahRAM(4);
        lp2.diskonHarga(5);

        lp3.tambahRAM(16);
        lp3.diskonHarga(15);

        lp4.tambahRAM(8);
        lp4.diskonHarga(0);

        lp5.tambahRAM(0);
        lp5.diskonHarga(20);

        lp6.tambahRAM(16);
        lp6.diskonHarga(10);

        lp7.tambahRAM(0);
        lp7.diskonHarga(5);

        lp8.tambahRAM(4);
        lp8.diskonHarga(12);

        lp9.tambahRAM(8);
        lp9.diskonHarga(8);

        lp10.tambahRAM(0);
        lp10.diskonHarga(25);

        // Menampilkan data setiap objek
        lp1.tampilkan();
        lp2.tampilkan();
        lp3.tampilkan();
        lp4.tampilkan();
        lp5.tampilkan();
        lp6.tampilkan();
        lp7.tampilkan();
        lp8.tampilkan();
        lp9.tampilkan();
        lp10.tampilkan();
    }
}

