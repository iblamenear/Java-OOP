package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor1;

public class MainDosen {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("11510", "Arief Ichwani, ST, MT");
        Rektor rektor = new Rektor("11511", "Nugroho Budhisantosa , ST.MMSI", 2010);
        Dekan dekan = new Dekan("11512", "Yulhendri, ST, M.T", "Teknik Informatika");

        System.out.println("Data Dosen:");
        dosen.view();

        System.out.println("\nData Rektor:");
        rektor.viewRektor();

        System.out.println("\nData Dekan:");
        dekan.viewDekan();
    }
}