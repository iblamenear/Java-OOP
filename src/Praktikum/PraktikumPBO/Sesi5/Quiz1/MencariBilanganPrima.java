package Praktikum.PraktikumPBO.Sesi5.Quiz1;

import java.util.Scanner;
public class MencariBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasBawah, batasAtas;

        System.out.print("Masukkan batas bawah: ");
        batasBawah = input.nextInt();
        System.out.print("Masukkan batas atas: ");
        batasAtas = input.nextInt();

        int jumlahPrima = 0;
        int angka = batasBawah;

        while (angka <= batasAtas) {
            if (isPrima(angka)) {
                jumlahPrima++;
            }
            angka++;
        }

        System.out.println("Jumlah bilangan prima antara " + batasBawah + " dan " + batasAtas + " adalah: " + jumlahPrima);
        
        input.close(); 
    }

    public static boolean isPrima(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}