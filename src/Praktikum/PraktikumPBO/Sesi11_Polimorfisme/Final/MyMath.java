package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Final;

// Class MyMath
public final class MyMath {

    // Konstanta PI dengan empat digit pecahan
    public static final double PI = 3.1416;

    // Method untuk menghitung luas lingkaran
    public final double luasLingkaran(double radius) {
        return PI * radius * radius;
    }

    // Method untuk menghitung keliling lingkaran
    public final double kelilingLingkaran(double radius) {
        return 2 * PI * radius;
    }

    // Method untuk menghitung sinus dari sudut dalam derajat
    public final double sin(double derajat) {
        return Math.sin(Math.toRadians(derajat));
    }

    // Method untuk menghitung cosinus dari sudut dalam derajat
    public final double cos(double derajat) {
        return Math.cos(Math.toRadians(derajat));
    }

    // Method untuk menghitung tangen dari sudut dalam derajat
    public final double tan(double derajat) {
        return Math.tan(Math.toRadians(derajat));
    }

    // Method untuk menghitung x pangkat y
    public final double pangkat(double x, double y) {
        return Math.pow(x, y);
    }
}
