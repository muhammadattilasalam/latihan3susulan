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

    // Method untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
    }
}