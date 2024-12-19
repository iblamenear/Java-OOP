package Praktikum.PraktikumPBO.Sesi12.Quiz3.Nomor3;

public class Main {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        Phone oppo = new Oppo();
        PhoneUser user = new PhoneUser(xiaomi);

        System.out.println("Testing Xiaomi:");
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nTesting iPhone:");
        Phone iphone = new iPhone();
        user = new PhoneUser(iphone);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nTesting Oppo:");
        Phone Oppo = new Oppo();
        user = new PhoneUser(Oppo);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
    }
}