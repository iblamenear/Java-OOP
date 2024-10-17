package Praktikum.PraktikumPBO.Sesi5.Quiz1;

import java.util.Scanner;
public class LoopUntil0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Masukkan Angka: ");
            int angka = input.nextInt();

            if(angka == 0){
                System.out.println("Program Selesai!");
                break;
            }
        }
    }
}