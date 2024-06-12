import java.util.Scanner;
public class Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coefficientApple=3.67,coefficientBanana=0.95,coefficientTomatoes=1.11,coefficientAubergine=5,coefficientPear=2.14;
        System.out.println("Enter the amount of apple : ");
        double apple = input.nextDouble();
        System.out.println("Enter the amount of banana : ");
        double banana = input.nextDouble();
        System.out.println("Enter the amount of tomatoes : ");
        double tomatoes = input.nextDouble();
        System.out.println("Enter the amount of aubergine : ");
        double aubergine = input.nextDouble();
        System.out.println("Enter the amount of pear : ");
        double pear = input.nextDouble();

        double price = coefficientApple*apple+coefficientBanana*banana+coefficientTomatoes*tomatoes+coefficientAubergine*aubergine+coefficientPear*pear;
        System.out.println("price = " + price);

    }
}
