package Jobsheet06;

public class HewanPeliharaan {
    protected String namaPanggilan;
    protected int umur;
    protected String jenisMakanan;
    protected double beratBadan;

    public HewanPeliharaan() {
        System.out.println("Satu hewan peliharaan baru berhasil ditambahkan!");
    }

    // (Overloading): Constructor berparameter
    public HewanPeliharaan(String namaPanggilan, int umur, String jenisMakanan, double beratBadan) {
        this.namaPanggilan = namaPanggilan;
        this.umur = umur;
        this.jenisMakanan = jenisMakanan;
        this.beratBadan = beratBadan;
    }

    // Method yang akan di-override oleh child class
    public String getInfo() {
        String info = "Nama Panggilan : " + this.namaPanggilan + "\n";
        info += "Umur           : " + this.umur + " tahun/bulan\n";
        info += "Jenis Makanan  : " + this.jenisMakanan + "\n";
        info += "Berat Badan    : " + this.beratBadan + " kg\n";
        return info;
    }
}
