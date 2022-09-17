public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int temp = sayi1;

      /*  if (temp >= sayi2 && temp > sayi3) {
            System.out.printf("\nEn büyük sayı sayı1: %d dir.\n", temp);
        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
            temp = sayi2;
            System.out.printf("\nEn büyük sayı sayı2: %d dir.\n", temp);
        } else {
            temp = sayi3;
            System.out.printf("\nEn büyük sayı sayı3: %d dür.\n", temp);
        }*/

        if (temp < sayi2) {
            temp = sayi2;
        }

        if (temp < sayi3) {
            temp = sayi3;
        }

        System.out.printf("\nEn büyük sayı %d dir.\n", temp);

    }
}
