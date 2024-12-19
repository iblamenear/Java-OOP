package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone Nyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone Mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Menambah Volume iPhone: " + volume);
            } else {
                System.out.println("iPhone Dalam Max Volume!");
            }
        } else {
            System.out.println("iPhone Mati. Tidak Bisa Mengatur Volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("iPhone volume decreased to: " + volume);
            } else {
                System.out.println("iPhone is at minimum volume!");
            }
        } else {
            System.out.println("iPhone is OFF. Cannot adjust volume.");
        }
    }
}