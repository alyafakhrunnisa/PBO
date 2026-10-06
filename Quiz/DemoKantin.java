package Quiz;

public class DemoKantin {
    public static void main(String[] args) {
        KartuKantin kartu1 = new KartuKantin("Alya Fakhrun - 254107060036");
        KartuKantin kartu2 = new KartuKantin("Jesyca Amila - 254107060037");
        KartuKantin kartu3 = new KartuKantin("Felia Dwi - 254107060038");

        System.out.println("=== Kartu 1 (Pengujian Transaksi Berhasil) ===");
        kartu1.topUp(120000); 
        System.out.println("Kategori Kartu 1: " + kartu1.getKategori()); 
        
        kartu1.bayar(30000); 
        System.out.println("Kategori Kartu 1 setelah bayar: " + kartu1.getKategori()); 
        System.out.println("Total Transaksi Kartu 1: " + kartu1.getJumlahTransaksi()); 

        System.out.println("\n=== Kartu 2 (Pengujian Top Up Tidak Valid) ===");
        kartu2.topUp(-50000); 
        kartu2.topUp(20000);  
        System.out.println("Kategori Kartu 2: " + kartu2.getKategori()); 
        System.out.println("Total Transaksi Kartu 2: " + kartu2.getJumlahTransaksi()); 

        System.out.println("\n=== Kartu 3 (Pengujian Pembayaran Gagal) ===");
        kartu3.topUp(50000);  
        kartu3.bayar(80000);  
        
        System.out.println("Sisa Saldo Kartu 3: Rp" + kartu3.getSaldo()); 
        System.out.println("Kategori Kartu 3: " + kartu3.getKategori()); 
        System.out.println("Total Transaksi Kartu 3: " + kartu3.getJumlahTransaksi()); 
    }
}
