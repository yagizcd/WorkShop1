import java.util.Scanner;

public class workShop1Task1 {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();

        double toplamTutar = 0;


        for (int i = 0; i < urunSayisi; i++) {
            System.out.print((i + 1) + ". ürünün fiyatını girin: ");
            double urunFiyati = scanner.nextDouble();
            toplamTutar += urunFiyati;
        }

        System.out.println("Toplam alışveriş tutarı: " + toplamTutar + " TL");

    }
}

