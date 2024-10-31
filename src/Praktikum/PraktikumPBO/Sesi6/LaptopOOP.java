package Praktikum.PraktikumPBO.Sesi6;

class Laptop {
    // buat 3 property untuk class laptop
    String pemilik;
    String merk;
    double ukuranLayar;

    // buat 2 method untuk class Laptop
    String hidupkanLaptop() {
        return "Hidupkan Laptop";
    }
    String matikanLaptop() {
        return "Matikan Laptop";
    }
};

public class LaptopOOP {
    public static void main(String[] args) {
        // buat object dari class Laptop (instansiasi)
        Laptop laptopAnto = new Laptop();

        // set nilai property
        laptopAnto.pemilik = "Nafilah";
        laptopAnto.merk = "HP";
        laptopAnto.ukuranLayar = 13.5;

        // tampilkan property object Laptop
        System.out.println(laptopAnto.pemilik);
        System.out.println(laptopAnto.merk);
        System.out.println(laptopAnto.ukuranLayar);

        // tampilkan hasil method object laptop
        System.out.println(laptopAnto.hidupkanLaptop());
        System.out.println(laptopAnto.matikanLaptop());
    }  
}