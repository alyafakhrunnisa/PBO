package Jobsheet06;

public class TugasDemo {
    public static void main(String[] args) {
        
        System.out.println("=== DATA KUCING ===");
        // Instansiasi objek child class menggunakan constructor berparameter
        Kucing kucing1 = new Kucing("Milo", 2, "Dry Food", 4.5, "Oren Belang", "Persia");
        System.out.println(kucing1.getInfo()); // Print info

        System.out.println("\n=== DATA ANJING ===");
        // Instansiasi objek child class
        Anjing anjing1 = new Anjing("Maxie", 3, "Meat/Wet Food", 15.0, "Medium", "Golden Retriever");
        System.out.println(anjing1.getInfo()); // Print info
        
        // Opsional: Menguji pemanggilan constructor tanpa parameter
        // System.out.println("\n=== UJI CONSTRUCTOR DEFAULT ===");
        // Kucing kucing2 = new Kucing();
    }
}
