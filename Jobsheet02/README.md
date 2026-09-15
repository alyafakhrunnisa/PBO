3.1 Percobaan 1
7.Pendeklarasian atribut terjadi di dalam file Mahasiswa.java, yaitu baris public String nim;, public String nama;, public String alamat;, dan public String kelas;
8.Pendeklarasian method terjadi di dalam file Mahasiswa.java pada blok method public void displayBiodata() { ... }.
9.Hanya 1 objek, yaitu objek dengan nama m1
10.Perintah tersebut mengisi atau meng-assign nilai teks (misal "023432") ke dalam atribut nim milik objek m1 secara spesifik.
11.Memanggil dan mengeksekusi method displayBiodata() agar data biodata yang melekat pada objek m1 dicetak ke terminal.

4.2 Percobaan 3
8.Kata kunci return berfungsi untuk mengirimkan atau mengembalikan nilai hasil perhitungan/proses dari dalam method kembali ke pemanggilnya. Method harus memiliki kata kunci return apabila return type pada deklarasi method tersebut bukan void (seperti int, double, atau String).

package Jobsheet01;
import java.util.Scanner;

public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

     do{   
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = hitung(angka1, operator, angka2);

        System.out.println("--- Hasil Perhitungan ---");
        System.out.println("Hasil : " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

        System.out.print("Apakah anda ingin menghitung lagi? (ya/tidak)");
        pilihan = input.next();
     }while(pilihan.equalsIgnoreCase("ya"));

        input.close();
    }

    public static double hitung(double angka1, String operator, double angka2) {
        double hasil = 0;

        switch (operator) {
            case "+":
                hasil = tambah(angka1, angka2);
                break;
            case "-":
                hasil = kurang(angka1, angka2);
                break;
            case "*":
                hasil = kali(angka1, angka2);
                break;
            case "/":
                if (angka2 == 0) {
                    System.out.println("Error: Tidak bisa membagi dengan nol!");
                    hasil = 0;
                } else {
                    hasil = bagi(angka1, angka2);
                }
                break;
            default:
                System.out.println("Operator tidak dikenali!");
        }

        return hasil;
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}