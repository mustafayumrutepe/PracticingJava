import java.util.Scanner;
    public class Hipotenus {
        public static void main(String[] args) {
            int line1, line2;
            Scanner inp = new Scanner(System.in);
            System.out.println("Birinci kenarı giriniz : ");
            line1 = inp.nextInt();
            System.out.print("İkinci kenarı giriniz : ");
            line2 = inp.nextInt();
            double hipotenus = Math.sqrt(line1*line1 + line2*line2);
            System.out.print("hipotenus degerimiz : " + hipotenus);
        }
    }