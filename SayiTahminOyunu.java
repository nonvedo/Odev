import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rastgeleSayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele sayı
        int hak = 3;
        boolean dogruTahmin = false;

        System.out.println("1 ile 100 arasında bir sayı tahmin edin!");

        while (hak > 0) {
            System.out.print("Tahmininizi girin: ");
            int tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 100) {
                System.out.println("Lütfen 1 ile 100 arasında bir sayı girin.");
                continue;
            }

            if (tahmin == rastgeleSayi) {
                dogruTahmin = true;
                break;
            } else {
                hak--;
                System.out.println("Yanlış tahmin! Kalan hakkınız: " + hak);

                if (tahmin < rastgeleSayi) {
                    System.out.println("Daha büyük bir sayı deneyin.");
                } else {
                    System.out.println("Daha küçük bir sayı deneyin.");
                }
            }
        }

        if (dogruTahmin) {
            System.out.println("Tebrikler! Doğru tahmin ettiniz!");
        } else {
            System.out.println("Hakkınız kalmadı! Doğru sayı " + rastgeleSayi + " idi.");
        }

        scanner.close();
    }
}