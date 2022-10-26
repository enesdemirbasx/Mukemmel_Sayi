import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;
        System.out.println("MÜKEMMEL SAYI BULMA PROGRAMI");
        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();
        while (sayi != sayac) {
            if (sayi % sayac == 0) {
                toplam += sayac;
            }
            sayac++;
        }
        if(sayi==toplam){
            System.out.println(sayi+" Mükemmel sayıdır");
        }else {
            System.out.println(sayi+" Mükemmel sayı değildir");
        }
    }
}