public class workShop1Task5 {
    public static void main(String args) {
        //5- String metotlarını araştırınız. Her bir metot için örnek yapınız.
        String str = "Etiya";
        int length = str.length();
        System.out.println(str +" Kelimesi "+length+" uzunlugundadir.");

        char ch = str.charAt(0);
        System.out.println(str +" Kelimesi ilk harfi "+ch+" idir.");

        String altString = str.substring(2, 5);
        System.out.println(str +" Kelimesinin 2 ile 5. karakter araligi "+altString+" idir.");

        String buyukStr = str.toUpperCase();
        System.out.println(str +" Kelimesinin harfleri buyuk yazilmis hali "+buyukStr+" idir.");

        String kucukStr = buyukStr.toLowerCase();
        System.out.println(buyukStr +" Kelimesinin harfleri kucuk yazilmis hali "+kucukStr+" idir.");

        int indeks = str.indexOf("y");
        System.out.println(str +" Kelimesinde y harfi "+(indeks+1)+". harf idir.");

        str = "Etiya Akademi";
        boolean startsWith = str.startsWith("Etiya");
        boolean endsWith = str.endsWith("Akademi");
        if (startsWith ==true && endsWith == true){
            System.out.println("Dogru");
        }

        String yeniStr = str.replace("Etiya", "Selam");
        System.out.println(yeniStr);
    }
}
