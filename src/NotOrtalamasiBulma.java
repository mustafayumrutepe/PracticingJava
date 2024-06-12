import java.util.Scanner;

public class NotOrtalamasiBulma {
    public static void main(String[] args) {

        int mat, fiz, kim, tur, tar, muz;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.print("fizik notunuz: ");
        fiz = inp.nextInt();
        System.out.print("kimya notunuz: ");
        kim = inp.nextInt();
        System.out.print("turkce notunuz: ");
        tur = inp.nextInt();
        System.out.print("Tarih notunuz: ");
        tar = inp.nextInt();
        System.out.print("Muzik notunuz: ");
        muz = inp.nextInt();
        int toplam=(mat+fiz+kim+tur+tar+muz);
        double ort = (double) toplam /6;
        System.out.println("Not ortalamaniz: \n  " +ort);
        String sonuc = (ort>=60)? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sonuc);

    }
}
