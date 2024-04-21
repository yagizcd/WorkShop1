public class workShop1Task4 {
    public static void main(String[] args) {
        int mukSayi = 28;
        int mukToplam = 0;
        for (int i =1; i<mukSayi; i++){
            if(mukSayi % i ==0){
                System.out.println(i);
                mukToplam +=i;

            }

        }
        if (mukToplam == mukSayi && mukSayi >= 6)
            System.out.println(mukSayi+" Mükemmel sayidir");
        else
            System.out.println(mukSayi+" Mükemmel sayi degildir");
    }
}
