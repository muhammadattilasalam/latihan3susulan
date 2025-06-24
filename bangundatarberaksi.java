package latihan3susulan;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        // Buat objek dari class BangunDatar
        BangunDatar tila = new BangunDatar();

        // Uji hitung luas segitiga
        tila.alas = 10;
        tila.tinggi = 6;
        tila.hitungLuasSegitiga();
        System.out.println("Luas Segitiga: " + tila.getHasil());

        // Uji hitung luas lingkaran
        tila.jariJari = 7;
        tila.hitungLuasLingkaran();
        System.out.println("Luas Lingkaran: " + tila.getHasil());
    }
}