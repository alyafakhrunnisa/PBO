package Quiz;

public class DemoParkir {
    public static void main (String[] args ) {
        Kendaraan k1 = new Kendaraan("N 1234 ALY", "Motor");
        Kendaraan k2 = new Kendaraan("W 5678 JES", "Mobil");
        Kendaraan k3 = new Kendaraan("L 9101 RAC", "Motor");

        System.out.println("=== Pengujian Transaksi Berhasil ===");
        k1.masuk(8); 
        k1.keluar(12); 

        System.out.println("\n=== Pengujian 3 Kondisi Tidak Valid ===");
        k2.masuk(10);
        k2.masuk(11); 
        
        k3.keluar(15); 
        k2.keluar(9); 
    }
}
