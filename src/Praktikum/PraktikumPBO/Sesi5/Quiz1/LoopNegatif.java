package Praktikum.PraktikumPBO.Sesi5.Quiz1;

import java.util.Scanner;
public class LoopNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        do {
            System.out.print("Masukkan sebuah angka (masukkan angka negatif untuk berhenti): ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            if (angka % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
        } while (true);
        System.out.println("Jumlah angka genap: " + jumlahGenap);
        System.out.println("Jumlah angka ganjil: " + jumlahGanjil);

        input.close();
    }
}