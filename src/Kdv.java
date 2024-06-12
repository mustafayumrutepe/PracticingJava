import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

        double para, kdv1 = 0.18, kdv2 = 0.8;

        Scanner inp = new Scanner(System.in);
        System.out.print("para miktarını giriniz : ");
        para = inp.nextInt();
        double kdv = (para<1000)&&(para>0)? kdv1 : kdv2;

        double kdvTutari=para*kdv, kdvliPara=para+kdvTutari;
        System.out.print("KDV oranı :  " + kdv + "\n" + "KDV tutarı miktarınız :  " + kdvTutari + "\n" + "KDV ile beraber para miktarınız : " + kdvliPara);
    }
}
