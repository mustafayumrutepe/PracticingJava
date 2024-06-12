import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, startPrice=10, total, k=2.2;
        Scanner giris = new Scanner(System.in);
        System.out.print("gittiğiniz mesafeyi kilometre cinsinden giriniz : ");
        km = giris.nextDouble();
        total = km*k;
        total += startPrice;
        total = (total<20)? 20 : total;
        System.out.print("ödemeniz : " + total);
    }
}
