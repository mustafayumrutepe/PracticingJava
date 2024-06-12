import java.util.Scanner;

public class AirplaneTrip {
    public static void main(String[] args) {
        int km, age, type;
        Scanner input = new Scanner(System.in);
        System.out.print("kilometer = ");
        km = input.nextInt();
        System.out.print("Age = ");
        age = input.nextInt();
        System.out.print("Type = ");
        type = input.nextInt();

        double price = km * 0.10;
        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            if (age < 12) {
                price -= price * 0.5;
            } else if (age <= 24) {
                price -= price * 0.10;
            } else if (age > 65) {
                price -= price * 0.30;
            }
            if (type == 2) {
                price -= price * 0.20;
            }
            System.out.println("Your price is : " + price);
        } else {
            System.out.println("You Entered Wrong Data!");
        }


//        System.out.println("km = " + km);
//        System.out.println("age = " + age);
//        System.out.println("way = " + way);


    }
}
