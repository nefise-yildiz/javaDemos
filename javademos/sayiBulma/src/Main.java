public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMı = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println("Sayı Mevcuttur");
        } else {
            System.out.println("Sayı Mevcut Değildir.");
        }
    }
}
