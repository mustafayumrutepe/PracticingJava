import java.util.Scanner;

public class PassStatus {
    public static void main(String[] args) {
        int math, phy, tur, chem, mus;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mathematics score : ");
        math = input.nextInt();
        System.out.println("Please enter your physics score : ");
        phy = input.nextInt();
        System.out.println("Please enter your turkish score : ");
        tur = input.nextInt();
        System.out.println("Please enter your chemistry score : ");
        chem = input.nextInt();
        System.out.println("Please enter your music score : ");
        mus = input.nextInt();
        double average = (double) (math + phy + tur + chem + mus) / 5;
        if ((0 <= math && math <= 100) && (0 <= phy && phy <= 100) && (0 <= tur && tur <= 100) && (0 <= chem && chem <= 100) && (0 <= mus && mus <= 100)) {
            if (average >= 55) {
                System.out.println("you passed.\tyour average score is : " + average);
            } else {
                System.out.println("you did not pass the class");
            }
        } else {
            System.out.println("you did not enter a valid grade");
        }


    }
}
