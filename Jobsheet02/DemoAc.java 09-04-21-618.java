public class DemoAc {
    public static void main(String[] args) {
        // Membuat 3 objek sesuai Tugas 3
        Ac ac1 = new Ac();
        

        System.out.println("=== DATA STATUS AC AWAL ===");
        ac1.tampilkanInfo();
        ac2.tampilkanInfo();
        ac3.tampilkanInfo();

        System.out.println("\n=== UJI COBA PENGGUNAAN ===");
        // Memanggil method yang telah dibuat
        ac1.nyalakanAc();
        ac1.naikkanSuhu();
        
        ac2.nyalakanAc();
        ac3.matikanAc();
    }
}
