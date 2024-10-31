package Praktikum.PraktikumPBO.Sesi6;

// kelas untuk delay lirik
class LyricLine {
    private String text;
    private int delay; // delay dalam milisecond

    // pembuatan konstruktor untuk lirik
    public LyricLine(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }

    // method untuk text
    public String getText() {
        return text;
    }

    // method untuk delay lirik
    public int getDelay() {
        return delay;
    }
}

// class untuk menangani lirik lagu
class Song {
    private LyricLine[] lyrics;

    // konstruktor untuk lirik line
    public Song(LyricLine[] lyrics) {
        this.lyrics = lyrics;
    }

    // method untuk mensimulasikan efek mengetik
    private void typeText(String text, int typingDelay) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(typingDelay); // delay antara karakter
        }
        System.out.println(); // untuk line baru atau enter
    }

    public void play() throws InterruptedException {
        int typingSpeed = 50; // kecepatan efek typing
        for (LyricLine line : lyrics) {
            typeText(line.getText(), typingSpeed);
            Thread.sleep(line.getDelay()); // pause setelah satu line
        }
    }
}

public class CreepLyricPlayer {
    public static void main(String[] args) {
        // mengatur delay pada lirik
        LyricLine[] lyrics = new LyricLine[] {
            new LyricLine("When you were here before", 2000),
            new LyricLine("Couldn't look you in the eye", 4000),
            new LyricLine("You're just like an angel", 4000),
            new LyricLine("Your skin makes me cry", 4000),
            new LyricLine("You float like a feather", 4000),
            new LyricLine("In a beautiful world", 3000),
            new LyricLine("I wish I was special", 4000),
            new LyricLine("You're so fucking special", 4000),
            new LyricLine("But I'm a creep", 3000),
            new LyricLine("I'm a weirdo", 3000),
            new LyricLine("What the hell am I doing here?", 3000),
            new LyricLine("I don't belong here", 3000)
        };

        // pembuatan instansiasi
        Song creep = new Song(lyrics);

        try {
            creep.play();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}