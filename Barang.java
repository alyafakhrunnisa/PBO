public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih(){
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayBarang() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Harga Kotor : Rp " + hargaKotor);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Harga Bersih: Rp " + getHargaBersih());
    }
}
