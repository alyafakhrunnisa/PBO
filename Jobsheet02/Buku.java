public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;
    public boolean statusDipinjam = false;

    public void tampilkanInfo(){
        System.out.println("-- Info Buku --");
        System.out.println("Judul           : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Kategori        : " + kategori);
        System.out.println("Status Dipinjam : " + (statusDipinjam ? "Ya" : "Tidak"));
    }

    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sedang dipinjam.");
        }
    }

    public void kembalikanBuku(){
        statusDipinjam = false;
        System.out.println("Buku " + judul + " berhasil dikembalikan.");
    }
}