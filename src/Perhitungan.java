package Laporan5Bab5;

public class Perhitungan {

    public static void hitungPenjumlahan(int p, int q) {
        int hasil = p + q;
        System.out.println("Nilai Hasil Penjumlahan adalah :" + hasil);
    }

    public static void hitungPengurangan(int p, int q) {
        int hasil = p - q;
        System.out.println("Nilai Hasil Pengurangan adalah :" + hasil);
    }

    public void hitungPerkalian(int p, int q) {
        int hasil = p * q;
        System.out.println("Nilai Hasil Perkalian adalah : " + hasil);
    }

    public void hitungPembagian(int p, int q) {
        int hasil = p / q;
        System.out.println("Nilai Pembagian adalah :" + hasil);
    }

    public void Sederhana(int pembilang, int penyebut) {
        for (int i = 2; i <= pembilang; i++) {
            if (pembilang % i == 0 && penyebut % i == 0) {
                pembilang /= i;
                penyebut /= i;
            } else if (i > pembilang) {
                break;
            }
        }
        System.out.println("Hasil dari penyederhanaan adalah  :" + pembilang + "/" + penyebut);
    }

}
