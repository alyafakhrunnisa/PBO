package Jobsheet01;
import java.util.Scanner;

public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = hitung(angka1, operator, angka2);

        System.out.println("--- Hasil Perhitungan ---");
        System.out.println("Hasil : " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

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