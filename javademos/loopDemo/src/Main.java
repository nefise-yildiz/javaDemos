public class Main {

    public static void main(String[] args) {
        // For
        for (int i=1; i<=10; i++){ // i+=2 dediğimiz zaman ise tek sayıları yazdırır.
            // i+=2 iken i=2 den başlattığımız zamanda ise çift sayıları yazdırır.
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        // Bir değişken tanımlandığı blokta geçerlidir.
        // While
        int i=1;
        while(i<10){
            System.out.println(i);
            i+=2; // i nin artış değerini vermemiş olsaydık döngü sonsuz döngüye girecekti.
        }
        System.out.println("While Döngüsü Bitti");

        // Do-While Döngüsü
        int j=2;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

        // While İle Do-While Döngüsü arasındaki fark
        // While döngüsünde şart sağlanmazsa hiçbir şekilde while ın içine girmez.
        // Fakat Do-While da şart uymasa bile kodlar satır satır çalıştığı için bir kere çaşışacak
    }
}
