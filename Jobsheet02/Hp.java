
public class Hp {
    public String merek;
    public String tipe;
    public int sisaBaterai;
    public boolean statusMenyala;

    public void nyalakanLayar() {
        statusMenyala = true;
        System.out.println("Layar HP " + merek + " " + tipe + " telah dinyalakan.");
    }

    public void matikanLayar() {
        statusMenyala = false;
        System.out.println("Layar HP " + merek + " " + tipe + " telah dimatikan.");
    }

    public void isiDaya(int tambahBaterai) {
        sisaBaterai += tambahBaterai;
        System.out.println("Baterai diisi. Sisa baterai sekarang: " + sisaBaterai + "%");
    }

    public void tampilkanInfo() {
        System.out.println("=== INFO HP ===");
        System.out.println("Merek  : " + merek);
        System.out.println("Tipe   : " + tipe);
        System.out.println("Baterai: " + sisaBaterai + "%");
    }
}
