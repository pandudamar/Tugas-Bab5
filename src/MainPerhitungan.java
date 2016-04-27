package Laporan5Bab5;

import java.util.Scanner;

public class MainPerhitungan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pilihan;
        Perhitungan per = new Perhitungan();
        do {
            System.out.println("--------===== Menu Aritmatika =====-------- ");
            System.out.println("1. Penjumlahan \n2. Pengurangan \n3. Perkalian \n4. Pembagian \n5. Penyederhanaan \n6. Exit");
            System.out.print("Masukkan Pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("~~~~~ Penjumlahan ~~~~~");
                    System.out.print("Masukkan Nilai Pertama : ");
                    int satu = in.nextInt();
                    System.out.print("Masukkan Nilai Kedua : ");
                    int dua = in.nextInt();
                    Perhitungan.hitungPenjumlahan(satu, dua);
                    break;
                case 2:
                    System.out.println("~~~~~ Pengurangan ~~~~~");
                    System.out.print("Masukkan Nilai Pertama : ");
                    int satup = in.nextInt();
                    System.out.print("Masukkan Nilai Kedua : ");
                    int duap = in.nextInt();
                    Perhitungan.hitungPengurangan(satup, duap);
                    break;
                case 3:
                    System.out.println("~~~~~ Perkalian ~~~~~");
                    System.out.print("Masukkan Nilai Pertama : ");
                    int bil1 = in.nextInt();
                    System.out.print("Masukkan Nilai Kedua : ");
                    int bil2 = in.nextInt();
                    per.hitungPerkalian(bil1, bil2);
                    break;
                case 4:
                    System.out.println("~~~~~ Pembagian ~~~~~");
                    System.out.print("Masukkan Nilai Pertama : ");
                    int bilangan1 = in.nextInt();
                    System.out.print("Masukkan Nilai Kedua : ");
                    int bilangan2 = in.nextInt();
                    per.hitungPembagian(bilangan1, bilangan2);
                    break;
                case 5:
                    System.out.println("~~~~~ Penyederhanaan ~~~~~");
                    System.out.print("Masukkan Nilai Pertama : ");
                    int nilai1 = in.nextInt();
                    System.out.print("Masukkan Nilai Kedua : ");
                    int nilai2 = in.nextInt();
                    per.Sederhana(nilai1, nilai2);
                    break;
                case 6:
                    System.out.println("Terimakasih ^~^");
                    break;
            }
        } while (pilihan != 6);
    }
}
