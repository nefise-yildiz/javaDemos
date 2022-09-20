public class Main {

    public static void main(String[] args) {
        char harf = 'i';

        switch (harf){
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Kalın Sesli Harf Girdiniz");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
                System.out.println("İnce Sesli Harf Girdiniz");
                break;
            default:
                System.out.println("Sessiz Harf Girdiniz");
        }

        }

    }

