import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b,select;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number : ");
        b = input.nextInt();

        System.out.println("1 Toplama\n2 Çıkartma\n3 Çarpma\n4 Bölme \n\nYukaridaki islemlerden birini seciniz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam sonucu : " + (a+b) );
                break;
            case 2:
                System.out.println("Çıkartma sonucu : "+ (a-b));
                break;
            case 3:
                System.out.println("Çarpma sonucu : " + (a*b));
                break;
            case 4:
                if(b!=0){
                System.out.println("Bölme sonucu : " + a/b );}
                else {
                        System.out.println("Bir sayı sıfıra bolunemez");
                    }
                break;
            default :
                System.out.println("Yanlış bir değer girdiniz. ");
        }

    }
}
