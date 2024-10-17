package Praktikum.PraktikumPBO.Sesi5.Quiz1;

import java.util.Scanner;
public class CekAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        if(angka < 0){
            System.out.println("Negatif");
        } else if(angka > 0){
            System.out.println("Positif");
        } else{
            System.out.println("Nol");
        }
    }
}