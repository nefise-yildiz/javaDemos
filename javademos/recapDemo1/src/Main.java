public class Main {

    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = 19;
        int sayi3 = 57;
//
//        if (sayi1>sayi2 && sayi1>sayi3){
//            System.out.println("En büyük sayı : " + sayi1);
//        }else if (sayi2>sayi1 && sayi2>sayi3) {
//            System.out.println("En büyük sayi : " + sayi2);
//        }else if (sayi3>sayi1 && sayi3>sayi2){
//            System.out.println("En büyük sayi : " + sayi3);
//        }
//        else{
//            System.out.println("Sayılar Birbirine Eşittir.");
//        }
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük Sayı = "+enBuyuk);




    }
}
