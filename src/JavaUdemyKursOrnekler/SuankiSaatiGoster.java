package JavaUdemyKursOrnekler;

public class SuankiSaatiGoster {
    public static void main(String[] args) {

        long toplamMiliSaniye = System.currentTimeMillis(); //1 ocak 1970 gece yarısından itibaren gecen zamanı verir miisaniye cinsinden
        System.out.println("Toplam Milisaniye =  " + toplamMiliSaniye);
        long toplamSaniye = toplamMiliSaniye / 1000;
        System.out.println("toplamSaniye =  " + toplamSaniye);
        long suankiSaniye = toplamSaniye % 60;
        System.out.println("suankiSaniye =  " + suankiSaniye);
        long toplamDakika = toplamSaniye / 60;
        System.out.println("toplamDakika =  " + toplamDakika);
        long suankiDakika = toplamDakika % 60;
        System.out.println("suankiDakika =  " + suankiDakika);
        long toplamSaat = toplamDakika / 60;
        System.out.println("toplamSaat =  " + toplamSaat);
        long suankiSaat = toplamSaat % 24;
        System.out.println("suankiSaat =  " + suankiSaat);
        System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye +"GMT");




    }
}
