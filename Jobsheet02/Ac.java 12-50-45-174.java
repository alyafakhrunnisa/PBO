public class Ac {
    public String merek;
    public int suhuSekarang;
    public String kecepatanKipas;
    public boolean statusMenyala;

    // Tugas 4: Constructor tanpa parameter (Nilai bawaan)
    public Ac() {
        merek = "Panasonic";
        suhuSekarang = 24;
        kecepatanKipas = "Medium";
        statusMenyala = false;
    }

    // Tugas 4: Constructor berparameter (Nilai dari luar)
    public Ac(String merek, int suhuSekarang, String kecepatanKipas) {
        this.merek = merek;
        this.suhuSekarang = suhuSekarang;
        this.kecepatanKipas = kecepatanKipas;
        this.statusMenyala = false;
    }

    public void nyalakanAc() {
        statusMenyala = true;
        System.out.println("AC " + merek + " dinyalakan.");
    }

    public void matikanAc() {
        statusMenyala = false;
        System.out.println("AC " + merek + " dimatikan.");
    }

    public void naikkanSuhu() {
        suhuSekarang++;
        System.out.println("Suhu AC " + merek + " dinaikkan menjadi " + suhuSekarang + " derajat celcius.");
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek + " | Suhu: " + suhuSekarang + "C | Kipas: " + kecepatanKipas);
    }
    
}
