package Praktikum.PraktikumPBO.Sesi4;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah");
        }
    }
}
