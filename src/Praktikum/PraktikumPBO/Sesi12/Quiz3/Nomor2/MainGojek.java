package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor2;

public class Main {
    public static void main(String[] args) {
        // Objek Gojek
        Gojek gojek = new Gojek();
        gojek.setData();
        System.out.println("Data Gojek:");
        gojek.tampil();

        // Objek Bayar
        Bayar bayar = new Bayar(1);
        System.out.println("\nData Bayar:");
        bayar.tampil();
    }
}