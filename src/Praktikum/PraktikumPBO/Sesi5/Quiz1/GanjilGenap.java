package Praktikum.PraktikumPBO.Sesi5.Quiz1;

public class GanjilGenap {
    public static void main(String[] args) {
        int jumlah = 0;

        for(int i = 1; i<=100; i++){
            if (i % 2 ==0){
                jumlah += i;
            }
        }
        System.out.println("Jumlah bilangan genap antara 1 dan 100: " + jumlah);
    }
}