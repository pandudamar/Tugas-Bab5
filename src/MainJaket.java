package Laporan5Bab5;

import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket price = new Jaket();
        int totBel = 0;
        do {
            System.out.println("===== Silahkan Pilih Jaket =====");
            System.out.println("1. Jaket A ");
            System.out.println("2. Jaket B ");
            System.out.println("3. Jaket C ");
            System.out.print("Masukkan Pilihan Anda : ");
            switch (in.nextInt()) {
                case 1 :
                     {
                        int temp = 1;
                        System.out.println("Masukkan Jumlah Jaket : ");
                        int jum = in.nextInt();
                        int h = cekJum(temp, price, jum);
                        totBel += h;
                        System.out.println("Harga Baju : ");
                        System.out.println("Rp. " + h +",-");
                        break;
                    }
                case 2: {
                    int temp = 2;
                    System.out.println("Masukkan Jumlah Jaket : ");
                    int jum = in.nextInt();
                    int h = cekJum(temp, price, jum);
                    totBel += h;
                    System.out.println("Harga Baju : ");
                    System.out.println("Rp. " + h +",-");
                    break;
                }
                case 3: {
                    int temp = 3;
                    System.out.println("Masukkan Jumlah Jaket : ");
                    int jum = in.nextInt();
                    int h = cekJum(temp, price, jum);
                    totBel += h;
                    System.out.println("Harga Baju : ");
                    System.out.println("Rp. " + h +",-");
                    break;
                }
            }
            System.out.println("Apakah anda masih ingin membeli ? (y/n) ");
        } while (in.next().equalsIgnoreCase("y"));
        System.out.println("Total Belanja : Rp. " + totBel +",-");
    }

    static int cekJum(int temp, Jaket harga, int jum) {
        int tot;
        switch (temp) {
            case 1: {
                int hargaSatuan = Jaket.JaketA();
                if (jum > 100) {
                    hargaSatuan -= 5000;
                }
                tot = hargaSatuan * jum;
                return tot;
            }
            case 2: {
                int hargaSatuan = Jaket.JaketB();
                if (jum > 100) {
                    hargaSatuan -= 5000;
                }
                tot = hargaSatuan * jum;
                return tot;
            }
            case 3: {
                int hargaSatuan = Jaket.JaketC();
                if (jum > 100) {
                    hargaSatuan -= 15000;
                }
                tot = hargaSatuan * jum;
                return tot;
            }
        }
        return 0;
    }
}