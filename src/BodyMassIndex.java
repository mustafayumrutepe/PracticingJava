import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your mass = ");
        double mass = input.nextDouble();
        System.out.print("enter your height = ");
        double height = input.nextDouble();
        double index = mass/(height*height);
        System.out.println("Your index = " + index);
    }
}
