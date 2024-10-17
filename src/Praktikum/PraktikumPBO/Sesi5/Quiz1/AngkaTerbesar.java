package Praktikum.PraktikumPBO.Sesi5.Quiz1;
 import java.util.Scanner;
public class AngkaTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaTerbesar = Integer.MIN_VALUE;

        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

        
            if (angka > angkaTerbesar) {
                angkaTerbesar = angka;
            }
        }

        
        System.out.println("Angka terbesar adalah: " + angkaTerbesar);

        input.close();
    }
}