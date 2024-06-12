import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("The month you were born : ");
        month = input.nextInt();
        System.out.print("The day you were born : ");
        day = input.nextInt();

        if (month<1 || month>12 || day<1 || day>31){                                        // I assumed all months had 30 days.
            System.out.println("You entered an undefined value. Please try again");
        }
        else {
            if (month == 1) {
                if (day >= 22)
                horoscope = "Aquarius";
                else {
                    horoscope = "Capricorn";
                }
            }

            if (month == 2) {
                if (day >= 20)
                    horoscope = "Pisces";
                else {
                    horoscope = "Aquarius";
                }
            }

            if (month == 3) {
                if (day >= 21)
                    horoscope = "Arius";
                else {
                    horoscope = "Pisces";
                }
            }

            if (month == 4) {
                if (day >= 21)
                    horoscope = "Taurus";
                else {
                    horoscope = "Arius";
                }
            }

            if (month == 5) {
                if (day >= 22)
                    horoscope = "Gemini";
                else {
                    horoscope = "Taurus";
                }
            }

            if (month == 6) {
                if (day >= 23)
                    horoscope = "Cancer";
                else {
                    horoscope = "Gemini";
                }
            }

            if (month == 7) {
                if (day >= 23)
                    horoscope = "Leo";
                else {
                    horoscope = "Cancer";
                }
            }

            if (month == 8) {
                if (day >= 23)
                    horoscope = "Virgo";
                else {
                    horoscope = "Leo";
                }
            }

            if (month == 9) {
                if (day >= 23)
                    horoscope = "Libra";
                else {
                    horoscope = "Virgo";
                }
            }

            if (month == 10) {
                if (day >= 23)
                    horoscope = "Scorpio";
                else {
                    horoscope = "Libra";
                }
            }

            if (month == 11) {
                if (day >= 22)
                    horoscope = "Sagittarius";
                else {
                    horoscope = "Scorpio";
                }
            }

            if (month == 12) {
                if (day >= 22)
                    horoscope = "Capricorn";
                else {
                    horoscope = "Sagittarius";
                }
            }

            System.out.print("Your horoscope is : " + horoscope);
        }
    }
}
