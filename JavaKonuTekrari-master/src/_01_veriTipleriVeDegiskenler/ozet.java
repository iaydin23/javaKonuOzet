package _01_veriTipleriVeDegiskenler;

import java.util.Arrays;

public class ozet {
    public static void main(String[] args) {
        boolean dogru=true;
        System.out.println(dogru);

        String deger="ibrAyd";
        boolean durum1=deger.equals("ibrAyd");
        System.out.println("durum1 = " + durum1);

        boolean durum2=deger.equals("ibrayd");
        System.out.println("durum2 = " + durum2);

        boolean durum3=deger.equalsIgnoreCase("ibrayd");
        System.out.println("durum3 = " + durum3);

        String deger4="hello Java";
        String deger5=deger4.replace("hello","merhaba");
        System.out.println("deger5 = " + deger5);

        int deger6=deger4.length();
        System.out.println("deger6 = " + deger6);

        boolean deger7=deger4.isEmpty();
        System.out.println("deger7 = " + deger7);

        String isim=new String("ibrahim");
        System.out.println("isim = " + isim);

        String substring=isim.substring(0,4);
        System.out.println("substring = " + substring);//substring = ibra

        System.out.println(isim.toUpperCase());

        int a=23;
        if (a>20){
            System.out.println("a sayisi buyuk");}
        if (a<20&& a>0){
            System.out.println("a sayisi kucuk");}
        if (a==0){
            System.out.println("a esit sifir");}

        int i=0;
        while (i<5){
            System.out.println("ibrayd");
        i++;}
        int b=0;
        for (b=0;b<5;b++){
            System.out.println(+b);
        }

        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2, -49, 52};//Dizi'mizi oluşturuyoruz

        //Diziyi sıralamak için Arrays.sort() kullanırız
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz

        // dizimizi direk konsola yazdırabilmek için Arrays.toString() kullanılır
        System.out.println(Arrays.toString(liste2));

    //Kapsülleme (Encapsulation) Kapsülleme yazılımcıya
        //    oluşturduğu sınıftaki değişkenlerin erişimlerini kontrol yetkisi verir.

   //Soyutlama (Abstraction) motorin tüketiminin nasıl hesaplandığıyla değil de
        //        sonuçlarıyla ilgileniyor olmalıyız.

       /*Kalıtım (Inheritance) Gerçek hayatta nasıl canlı -> hayvan -> kuş -> güvercin gibi
        genelden özele inebiliyorsak, aynı şekilde yazılımda da
        bu bahsettiğim kavramları birer nesne gibi düşünerek oluşturabiliriz.
        Java dilinde Kalıtım sağlanırken “extends” anahtar kelimesi kullanılmaktadır.
       public class BinekAraba extends Araba {
       }*/

        /*Çok Biçimliliği(Polymorphism), ana sınıf içerisinde tanımlanan bir metodun
    alt sınıflarda değiştirilerek kullanılması olarak tanımlayabiliriz*/
        /*int[] liste = {1, 4, 5, 11, 15,22, 33,66,67,68,75};//Dizi'mizi oluşturuyoruz
        //Dizide bir elemanın indeksini bulmak için Arrays.binarySearch() kullanırız
        //!!!!! Arrays.binarySearch() kullanabilmemiz için dizimiz SIRALI olmalıdır. !!!!
        //Eğer sıralı değilse Arrays.sort ile sıralayabilirsiniz
        Arrays.sort(liste);
        System.out.println("liste = " + Arrays.toString(liste));
        int index = Arrays.binarySearch(liste,5); //bulunduğu indeksi döner,aradığımız sayı dizide mevcut değilse negatif bir sayı döner
        System.out.println("5'in indeksi :"+index);*/
    }
}