public class HpDemo {
    public static void main(String[] args) {
        // 1. Membuat Object Pertama
        Hp hp1 = new Hp();
        hp1.merek = "Samsung";
        hp1.tipe = "Galaxy S24";
        hp1.sisaBaterai = 80;
        hp1.statusMenyala = false;

        // 2. Membuat Object Kedua
        Hp hp2 = new Hp();
        hp2.merek = "iPhone";
        hp2.tipe = "15 Pro";
        hp2.sisaBaterai = 45;
        hp2.statusMenyala = false;

        // 3. Membuat Object Ketiga
        Hp hp3 = new Hp();
        hp3.merek = "Xiaomi";
        hp3.tipe = "Redmi Note 13";
        hp3.sisaBaterai = 15;
        hp3.statusMenyala = false;

        // Memanggil method untuk menampilkan info dan perilaku masing-masing objek
        System.out.println("=== PENGUJIAN HP 1 ===");
        hp1.tampilkanInfo();
        hp1.nyalakanLayar();

        System.out.println("\n=== PENGUJIAN HP 2 ===");
        hp2.tampilkanInfo();
        hp2.isiDaya(20);

        System.out.println("\n=== PENGUJIAN HP 3 ===");
        hp3.tampilkanInfo();
        hp3.matikanLayar();
    }
}
