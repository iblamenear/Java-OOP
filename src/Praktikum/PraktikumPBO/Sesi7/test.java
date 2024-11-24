package Praktikum.PraktikumPBO.Sesi7;
import java.util.Date;
import java.util.List;

// Class Penulis
class Penulis {
    private String nama;
    private Date tanggalLahir;
    private String kebangsaan;

    // Constructor
    public Penulis(String nama, Date tanggalLahir, String kebangsaan) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.kebangsaan = kebangsaan;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }
}

// Class Buku
class Buku {
    private String judul;
    private int tahunTerbit;
    private String ISBN;
    private List<Penulisan> penulisanList;

    // Constructor
    public Buku(String judul, int tahunTerbit, String ISBN) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = ISBN;
    }

    // Getters and Setters
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Penulisan> getPenulisanList() {
        return penulisanList;
    }

    public void setPenulisanList(List<Penulisan> penulisanList) {
        this.penulisanList = penulisanList;
    }
}

// Class Penulisan (Kelas Asosiasi)
class Penulisan {
    private Buku buku;
    private Penulis penulis;
    private String peran;

    // Constructor
    public Penulisan(Buku buku, Penulis penulis, String peran) {
        this.buku = buku;
        this.penulis = penulis;
        this.peran = peran;
    }

    // Getters and Setters
    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }
}

