package Jobsheet01;

public class LaptopStruktural
{
    public static void main(String[] args)
    {
        // objek Laptop 1
        String merek1 = "Asus";
        int ramGB1 = 8;
        double hargaJuta1 = 9.5;

        // objek Laptop 2
        String merek2 = "Acer";
        int ramGB2 = 4;
        double hargaJuta2 = 6.0;

        // objek Laptop 3
        String merek3 = "Lenovo";
        int ramGB3 = 16;
        double hargaJuta3 = 12.0;

        // objek Laptop 4
        String merek4 = "HP";
        int ramGB4 = 8;
        double hargaJuta4 = 8.7;

        // objek Laptop 5
        String merek5 = "Dell";
        int ramGB5 = 16;
        double hargaJuta5 = 14.5;

        // objek Laptop 6
        String merek6 = "MSI";
        int ramGB6 = 16;
        double hargaJuta6 = 18.0;

       // objek Laptop 7
        String merek7 = "Apple MacBook";
        int ramGB7 = 8;
        double hargaJuta7 = 21.0;

       // objek Laptop 8
        String merek8 = "Axioo";
        int ramGB8 = 4;
        double hargaJuta8 = 5.5;

        // objek Laptop 9
        String merek9 = "Samsung";
        int ramGB9 = 8;
        double hargaJuta9 = 10.2;

        // objek Laptop 10
        String merek10 = "Razer";
        int ramGB10 = 32;
        double hargaJuta10 = 35.0;
        
        // pemanggilan function tambahRAM() dan diskonHarga()
        ramGB1 = tambahRAM(ramGB1, 8);            
        hargaJuta1 = diskonHarga(hargaJuta1, 10);  

        ramGB2 = tambahRAM(ramGB2, 4);
        hargaJuta2 = diskonHarga(hargaJuta2, 5);

        ramGB3 = tambahRAM(ramGB3, 16);
        hargaJuta3 = diskonHarga(hargaJuta3, 15);

        ramGB4 = tambahRAM(ramGB4, 8);
        hargaJuta4 = diskonHarga(hargaJuta4, 0);

        ramGB5 = tambahRAM(ramGB5, 0);
        hargaJuta5 = diskonHarga(hargaJuta5, 20);

        ramGB6 = tambahRAM(ramGB6, 16);
        hargaJuta6 = diskonHarga(hargaJuta6, 10);

        ramGB7 = tambahRAM(ramGB7, 0);
        hargaJuta7 = diskonHarga(hargaJuta7, 5);

        ramGB8 = tambahRAM(ramGB8, 4);
        hargaJuta8 = diskonHarga(hargaJuta8, 12);

        ramGB9 = tambahRAM(ramGB9, 8);
        hargaJuta9 = diskonHarga(hargaJuta9, 8);

        ramGB10 = tambahRAM(ramGB10, 0);
        hargaJuta10 = diskonHarga(hargaJuta10, 25);

        
        tampilkan(merek1, ramGB1, hargaJuta1);
        tampilkan(merek2, ramGB2, hargaJuta2);
        tampilkan(merek3, ramGB3, hargaJuta3);
        tampilkan(merek4, ramGB4, hargaJuta4);
        tampilkan(merek5, ramGB5, hargaJuta5);
        tampilkan(merek6, ramGB6, hargaJuta6);
        tampilkan(merek7, ramGB7, hargaJuta7);
        tampilkan(merek8, ramGB8, hargaJuta8);
        tampilkan(merek9, ramGB9, hargaJuta9);
        tampilkan(merek10, ramGB10, hargaJuta10);
    }

    // behavior 1: menambahkan RAM 
    public static int tambahRAM(int ramSekarang, int tambahan)
    {
        ramSekarang += tambahan;
        return ramSekarang;
    }

    //behavior 2: menghitung harga setelah diskon
    public static double diskonHarga(double hargaSekarang, double persenDiskon)
    {
        double potongan = hargaSekarang * (persenDiskon / 100);
        hargaSekarang -= potongan;
        return hargaSekarang;
    }

    // untuk menampilkan data laptop
    public static void tampilkan(String merek, int ram, double harga)
    {
        System.out.println("Merek  : " + merek);
        System.out.println("RAM    : " + ram + " GB");
        System.out.println("Harga  : Rp " + harga + " juta");
        System.out.println("-------------------------------");
    }
}
