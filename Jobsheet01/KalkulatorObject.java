package Jobsheet01;

import java.util.Scanner;

// Class yang merepresentasikan objek Kalkulator (OOP)
class Kalkulator {
    // Atribut / State
    private double angka1;
    private double angka2;
    private String operator;

    // Constructor
    public Kalkulator(double angka1, String operator, double angka2) {
        this.angka1 = angka1;
        this.operator = operator;
        this.angka2 = angka2;
    }

    // Method / Behavior operasi matematika
    public double tambah() {
        return this.angka1 + this.angka2;
    }

    public double kurang() {
        return this.angka1 - this.angka2;
    }

    public double kali() {
        return this.angka1 * this.angka2;
    }

    public double bagi() {
        if (this.angka2 == 0) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
            return Double.NaN;
        }
        return this.angka1 / this.angka2;
    }

    // Method untuk mengeksekusi perhitungan berdasarkan operator
    public double hitung() {
        switch (this.operator) {
            case "+":
                return tambah();
            case "-":
                return kurang();
            case "*":
                return kali();
            case "/":
                return bagi();
            default:
                System.out.println("Operator tidak dikenali!");
                return Double.NaN;
        }
    }

    // Method untuk menampilkan hasil perhitungan
    public void tampilkanHasil() {
        double hasil = hitung();
        if (!Double.isNaN(hasil)) {
            System.out.println("--- Hasil Perhitungan ---");
            System.out.println("Hasil : " + this.angka1 + " " + this.operator + " " + this.angka2 + " = " + hasil);
        }
    }
}

// Class Utama (Driver Class)
public class KalkulatorObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Instansiasi objek Kalkulator
        Kalkulator kalkulator = new Kalkulator(angka1, operator, angka2);

        // Menjalankan method objek
        kalkulator.tampilkanHasil();

        input.close();
    }
}
