public class Anggota {
    public String nama;
    public String nim;
    public String jurusan;
    
    public void tampilkanInfo() {
        System.out.println("-- Info Anggota --");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    public void pinjamBuku(){
        System.out.println("Anggota a.n " + nama + " memproses peminjaman buku di kasir.");
    }

    public void kembalikanBuku(){
        System.out.println("Anggota a.n " + nama + " memproses pengembalian buku di kasir.");
    }
}
