package latihan3susulan;

/*
 * Nama : muhammad attila salam
 * NPM  : 2310010635
 * Kelas: 4a
 */

public class BangunDatar {
    // Atribut bertipe desimal
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Constructor untuk inisialisasi semua atribut ke 0
    public BangunDatar() {
        alas = 0;
        tinggi = 0;
        jariJari = 0;
        hasil = 0;
    }

    // Method untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
    }

    // Accessor untuk mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }
}