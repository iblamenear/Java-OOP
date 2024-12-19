package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi Nyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi Mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Menambah Volume Xiaomi: " + volume);
            } else {
                System.out.println("Xiaomi Dalam Max Volume!");
            }
        } else {
            System.out.println("Xiaomi Mati. Tidak Bisa Mengatur Volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Mengurangi Volume Xiaomi: " + volume);
            } else {
                System.out.println("Xiaomi Dalam Minimum Volume!");
            }
        } else {
            System.out.println("Xiaomi Mati. Tidak Bisa Mengatur Volume.");
        }
    }
}