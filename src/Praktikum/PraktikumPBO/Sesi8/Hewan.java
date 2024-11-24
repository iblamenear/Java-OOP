package Praktikum.PraktikumPBO.Sesi8;

class pewarisan {
    protected String suara;

    public pewarisan() {
        this.suara = "suara";
    }

    public void cetak() {
        System.out.println("Hewan Bersuara: " + suara);
    }
}

class Mamalia extends pewarisan {
    protected String berkembangBiak;

    public Mamalia() {
        this.berkembangBiak = "beranak";
    }

    @Override
    public void cetak() {
        System.out.println("Mamalia Berkembang Biak: " + berkembangBiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi() {
        suara = "Hemoh..";
        berkembangBiak = "Beranak";
        this.nama = "Sopi";
        this.umur = "1";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Mamalia Sapi =======");
        System.out.println("Suara              : " + suara);
        System.out.println("Berkembang Biak    : " + berkembangBiak);
        System.out.println("Nama               : " + nama);
        System.out.println("Umur               : " + umur + " tahun");
    }
}

class Kambing extends Mamalia {
    private String nama;
    private String umur;

    public Kambing() {
        suara = "Embek....";
        berkembangBiak = "Beranak";
        this.nama = "Si Ling";
        this.umur = "2";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Mamalia Kambing =======");
        System.out.println("Suara              : " + suara);
        System.out.println("Berkembang Biak    : " + berkembangBiak);
        System.out.println("Nama               : " + nama);
        System.out.println("Umur               : " + umur + " tahun");
    }
}

class Unggas extends pewarisan {
    protected String berkembangBiak;

    public Unggas() {
        this.berkembangBiak =  "Bertelur";

    }

    @Override
    public void cetak() {
        System.out.println("Unggas Bertelur: " + berkembangBiak);
    }
}

class Burung extends Unggas {
    private String jenis;
    private String ciri;

    public Burung() {
        suara = "Mbekur....";
        berkembangBiak = "Bertelur";
        this.jenis = "Merpati";
        this.ciri = "Bulu Putih";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Unggas Burung =======");
        System.out.println("Suara               : " + suara);
        System.out.println("Berkembang Biak     : " + berkembangBiak);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Cici                : " + ciri);
    }
}

class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam() {
        suara = "Petok-Petok";
        berkembangBiak = "Bertelur";
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu Bercorak Putih Hitam";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Unggas Ayam =======");
        System.out.println("Suara               : " + suara);
        System.out.println("Berkembang Biak     : " + berkembangBiak);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Ciri                : " + ciri);
    }
}

class Ikan extends pewarisan {
    protected String napas;

    public Ikan() {
        this.napas = "Insang";
    }

    @Override
    public void cetak() {
        System.out.println("Hewan Bernapas: " + napas);
    }
}

class Gurami extends Ikan {
    private String ciri;
    private String berat;

    public Gurami() {
        suara = "Blubup Blubup";
        napas = "Insang";
        this.ciri = "Berwarna Hitam";
        this.berat = "2";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Ikan Gurami =======");
        System.out.println("Suara               : " + suara);
        System.out.println("Bernapas            : " + napas);
        System.out.println("Ciri                : " + ciri);
        System.out.println("Berat               : " + berat + " kg");
    }
}

class Lele extends Ikan {
    private String ciri;
    private String berat;

    public Lele() {
        suara = "Blubup Blubup";
        napas = "Insang";
        this.ciri = "Berwarna Hitam Keputihan";
        this.berat = "3";
    }

    @Override
    public void cetak() {
        System.out.println("======= Data Hewan Ikan Lele =======");
        System.out.println("Suara               : " + suara);
        System.out.println("Bernapas            : " + napas);
        System.out.println("Ciri                : " + ciri);
        System.out.println("Berat               : " + berat + " kg");
    }
}

public class Hewan {
    public static void main(String[] args) {
        Sapi sp1 = new Sapi();
        sp1.cetak();
        System.out.println();

        Kambing kmb1 = new Kambing();
        kmb1.cetak();
        System.out.println();

        Burung brg1 = new Burung();
        brg1.cetak();
        System.out.println();

        Ayam aym1 = new Ayam();
        aym1.cetak();
        System.out.println();

        Gurami grm1 = new Gurami();
        grm1.cetak();
        System.out.println();

        Lele ll1 = new Lele();
        ll1.cetak();
    }
}
