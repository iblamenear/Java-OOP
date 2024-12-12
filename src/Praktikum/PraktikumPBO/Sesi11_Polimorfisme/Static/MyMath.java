package Praktikum.PraktikumPBO.Sesi11_Polimorfisme.Static;

// Class MyMath
public final class MyMath {

    // Konstanta PI dengan empat digit pecahan
    public static final double PI = 3.1416;

    // Method static untuk menghitung luas lingkaran
    public static double luasLingkaran(double radius) {
        return PI * radius * radius;
    }

    // Method static untuk menghitung keliling lingkaran
    public static double kelilingLingkaran(double radius) {
        return 2 * PI * radius;
    }

    // Method static untuk menghitung sinus dari sudut dalam derajat
    public static double sin(double derajat) {
        return Math.sin(Math.toRadians(derajat));
    }

    // Method static untuk menghitung cosinus dari sudut dalam derajat
    public static double cos(double derajat) {
        return Math.cos(Math.toRadians(derajat));
    }

    // Method static untuk menghitung tangen dari sudut dalam derajat
    public static double tan(double derajat) {
        return Math.tan(Math.toRadians(derajat));
    }

    // Method static untuk menghitung x pangkat y
    public static double pangkat(double x, double y) {
        return Math.pow(x, y);
    }
}
