public class Main {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
//            case 'B':
//                System.out.println("Çok Güzel : Geçtiniz");
//                break;
//            case 'C':
//                System.out.println("İyi : Geçtiniz");
//                break;
            // Diyelim ki öğrenci B aldığında da C aldığında da aynı sonucu alacak onu da aşağıda ki gibi yazılabilir.
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not");
        }
    }
    // ctrl+shift+alt+l komutu ile kodlarımızın yazımını düzenleyebiliriz.
}
