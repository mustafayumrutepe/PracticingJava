import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r, a;
        Scanner giris = new Scanner(System.in);
        System.out.print("yarıçapı giriniz : ");
        r=giris.nextInt();
        System.out.print("açıyı giriniz : ");
        a=giris.nextInt();
        double alan = 3.14 * (r*r) * a / 360;
        System.out.print("daire diliminizin alanı : " + alan);



    }
}
