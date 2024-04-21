import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean donguicin = true;
        Scanner scanner = new Scanner(System.in);
        int girdi = 0;
        while(donguicin){
            System.out.print("|*** Cikmak icin 0\n" +
                    "|***************************************************|\n"+
                    "|*** Urun Taski icin(Task1) 1                    ***|\n" +
                    "|*** Do-While, While Farkı icin(Task2) 2         ***|\n" +
                    "|*** 1 ile 10 arası tahmin yapmak icin (Task3) 3 ***|\n" +
                    "|*** Mukemmel Sayi icin 4(task4) 4               ***|\n" +
                    "|*** String Metodları icin (task5) 5             ***|\n" +
                    "|*** Ogrenci not ortalamasi icin(task6) 6        ***|\n" +
                    "|***************************************************|\n"+
                    "Seciminiz: ");
            girdi = scanner.nextInt();
            if (girdi == 1)
                workShop1Task1.main(args);
            else if(girdi ==2)
                workShop1Task2.main(args);
            else if(girdi==3)
                workShop1Task3.main(args);
            else if(girdi == 4)
                workShop1Task4.main(args);
            else if (girdi ==5)
                workShop1Task5.main(args);
            else if(girdi ==6)
                workShop1Task6.main(args);
            else if(girdi == 0) {
                return;
            }
            else
                System.out.println("Gecerli bir numara giriniz");
            System.out.println();



        }
    }
}