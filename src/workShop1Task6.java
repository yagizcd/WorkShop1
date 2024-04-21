import java.util.Scanner;
public class workShop1Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();


        double toplamNot = 0;


        for (int i = 1; i <= ogrenciSayisi; i++) {

            System.out.println("\n" + i + ". öğrenci bilgilerini giriniz:");

            System.out.print("Öğrenci adı: ");
            String ad = scanner.next();

            System.out.print("Öğrenci soyadı: ");
            String soyad = scanner.next();

            System.out.print("1. sınav notu: ");
            double not1 = scanner.nextDouble();

            System.out.print("2. sınav notu: ");
            double not2 = scanner.nextDouble();

            System.out.print("3. sınav notu: ");
            double not3 = scanner.nextDouble();

            if (not1 <0 || not2 <0 || not3 <0){
                System.out.println("Notlardan herhangi biri 0'dan küçük");
                continue;
            }


            double ortalama = (not1 + not2 + not3) / 3;


            toplamNot += ortalama;


            System.out.println("\n" + ad + " " + soyad + " için not ortalaması: " + ortalama);
        }
    }
}
