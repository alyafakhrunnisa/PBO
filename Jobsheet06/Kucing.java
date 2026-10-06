package Jobsheet06;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    private String rasKucing;

    //  (Overloading): Constructor tanpa parameter
    public Kucing() {
        super(); 
        System.out.println("Satu ekor kucing baru berhasil ditambahkan!");
    }

    //  (Overloading): Constructor berparameter
    public Kucing(String namaPanggilan, int umur, String jenisMakanan, double beratBadan, String warnaBulu, String rasKucing) {
        super(namaPanggilan, umur, jenisMakanan, beratBadan); 
        this.warnaBulu = warnaBulu;
        this.rasKucing = rasKucing;
    }

    // (Overriding): Method dengan nama dan signature yang sama persis
    public String getInfo() {
        String info = super.getInfo(); 
        info += "Warna Bulu     : " + this.warnaBulu + "\n";
        info += "Ras Kucing     : " + this.rasKucing + "\n";
        return info;
    }
}
