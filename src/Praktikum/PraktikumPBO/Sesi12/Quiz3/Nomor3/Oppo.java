package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo Nyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo Mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Menambah Volume Oppo: " + volume);
            } else {
                System.out.println("Oppo Dalam Max Volume!");
            }
        } else {
            System.out.println("Oppo Mati. Tidak Bisa Mengatur Volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Oppo volume decreased to: " + volume);
            } else {
                System.out.println("Oppo is at minimum volume!");
            }
        } else {
            System.out.println("Oppo is OFF. Cannot adjust volume.");
        }
    }
}