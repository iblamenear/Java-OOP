package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}