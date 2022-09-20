import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Stringlerde birer char arraydir.
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı = " + mesaj.length());
        // charAt : Bir metinde belli bir karakterdeki değeri yakalamak için kullanılır
        System.out.println("5.Eleman = " + mesaj.charAt(4));
        // concat: İki metni birleştirmek için kullanılır.
        System.out.println(mesaj.concat(" Yaşasın")); //Burada yeni bir string oluşturuyor
        // daha sonra kullanmak için bir değişkene atamak gerekir.
        // startsWith() : Bir metnin hangi karakter ile başlayıp başlamadığı sorgularnır. True veya false döndürür.
        // endsWith() : Bir metnin hangi karakter ile bittiğini sorgulamak için kullanılır. True veya false döndürür.
        // startsWith ve endsWith küçük büyük harf duyarlıdır.

        System.out.println(mesaj.startsWith("A"));//Mesaj A ile başlıyor mu?
        System.out.println(mesaj.endsWith(".")); // Mesaj . ile mi bitiyor?
*/
        /*// getChars : Bir metindeki karakterleri bir listeye atamak için kullanılır.
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); //0. elemandan başla 5. elemana kadar (5. eleman dahil değil)
        // karakterler adlı diziye 0.indexten başlayarak ata demektir.
        System.out.println(karakterler);

        //indexOf : Belirttiğim karakterin mesajın içinde kaçıncı eleman olduğunu bulmaya yarar.
        System.out.println(mesaj.indexOf("av")); // karakter veya bir metni de arayabiliriz. İlk bulduğu sonucun eleman sayısını bize verecektir.
        // Yani birçok a var fakat bize ilk karşılaştığı a nın eleman sayısını verecektir.
        System.out.println(mesaj.lastIndexOf('a'));
        // lastIndexOf : Belirtttiğim karakteri mesajın sağından başlayarak kaçıncı eleman olduğunu bulmaya yarar.*/

        // replace : Bir metindeki değiştirmek istediğimiz bölümler için kullandığımız bir fonksiyondur.
        String yeniMesaj= mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        // subString : Bir metnin içerisinden parça almak için kullanılır.
        System.out.println(mesaj.substring(2)); //mesajı 2.indeksten itibaren al(2. indeks dahil)
        System.out.println(mesaj.substring(2,4));//mesajı 2. indeksten 4. indekse kadar al(4. indeks dahil değil)

        //split : Bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        // toLowerCase : Bir metindeki kelimelerin bütün harflerini küçük harflere çevirir.
        System.out.println(mesaj.toLowerCase(Locale.ROOT));

        // toUpperCase : Bir metindeki kelimelerin bütün harflerini büyük harflere çevirir.
        System.out.println(mesaj.toUpperCase(Locale.ROOT));

        // trim : Bir metninbaşındaki ve sonundaki boşlukları silmeye yarar.
        System.out.println(mesaj.trim());



    }
}
