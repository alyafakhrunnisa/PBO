public class DemoPerpustakaan {
    public static void main(String[] args) {
        // 1. Membuat Object Petugas
        Petugas admin1 = new Petugas();
        admin1.nama = "Nayla Putri";
        admin1.idPetugas = "ADM-001";
        admin1.shiftKerja = "Pagi";

        // 2. Membuat Object Anggota
        Anggota anggota1 = new Anggota();
        anggota1.nama = "Alya Fakhrun Nisa";
        anggota1.nim = "254107060036";
        anggota1.jurusan = "Sistem Informasi Bisnis";

        // 3. Membuat Object Buku
        Buku buku1 = new Buku();
        buku1.judul = "Komet";
        buku1.penulis = "Tere Liye";
        buku1.tahunTerbit = 2018;
        buku1.kategori = "Fiksi";

        System.out.println("--- Sistem Perpustakaan ---");
        admin1.bukaSistem();
        System.out.println();
        
        admin1.tampilkanInfo();
        System.out.println();
        anggota1.tampilkanInfo();
        System.out.println();
        buku1.tampilkanInfo();

        System.out.println("\n--- Proses Peminjaman Buku ---");
        anggota1.pinjamBuku();
        admin1.layaniPeminjaman();
        buku1.pinjamBuku();
    }
}