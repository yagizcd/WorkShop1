import java.util.Random;
import java.util.Scanner;

public class workShop1Task3 {
    public static void main(String[] args) {
        //3-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
        // (While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(10);
        int sayac = 0;
        int tahmin = 0;
        while(tahmin != randNum){
            System.out.print("Tahmin ettiginiz sayi:");
            tahmin = scanner.nextInt();
            sayac++;


        }
        System.out.println();
        System.out.print("Sayi "+randNum+" idi");
        System.out.println();
        System.out.print(sayac+" Kere tahmin yaptınız\n");

    }
}
