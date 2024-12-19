package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung Nyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung Mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Menambah Volume Samsung: " + volume);
            } else {
                System.out.println("Samsung Dalam Max Volume!");
            }
        } else {
            System.out.println("Samsung Mati. Tidak Bisa Mengatur Volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Samsung volume decreased to: " + volume);
            } else {
                System.out.println("Samsung is at minimum volume!");
            }
        } else {
            System.out.println("Samsung is OFF. Cannot adjust volume.");
        }
    }
}