package Jobsheet06;

public class Anjing extends HewanPeliharaan {
    private String ukuranTubuh;
    private String rasAnjing;

    // (Overloading): Constructor tanpa parameter
    public Anjing() {
        super();
        System.out.println("Satu ekor anjing baru berhasil ditambahkan!");
    }

    // (Overloading): Constructor berparameter
    public Anjing(String namaPanggilan, int umur, String jenisMakanan, double beratBadan, String ukuranTubuh, String rasAnjing) {
        super(namaPanggilan, umur, jenisMakanan, beratBadan); // Memanggil constructor parent
        this.ukuranTubuh = ukuranTubuh;
        this.rasAnjing = rasAnjing;
    }

    // (Overriding)
    public String getInfo() {
        String info = super.getInfo();
        info += "Ukuran Tubuh   : " + this.ukuranTubuh + "\n";
        info += "Ras Anjing     : " + this.rasAnjing + "\n";
        return info;
    }
}
