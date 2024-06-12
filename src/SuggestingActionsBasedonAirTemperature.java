import java.util.Scanner;

public class SuggestingActionsBasedonAirTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the heat value : ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Ski today");
        }
        else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Go to the cinema");
            }
            if (10 <= heat) {
                System.out.println("Have a picnic today");
            }
        } else {
            System.out.println("Go swimming today");
        }
    }
}
