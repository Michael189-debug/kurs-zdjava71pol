package app;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Taryfikator {
    final static long FREE_PERIOD = 10 * 60;
    final static long PAY_PERIOD_TO_HALF_HOUR = 30 * 60;
    final static long PAY_PERIOD_TO_HOUR = 60 * 60;
    final static int PRICE_HALF_HOUR = 100;
    final static int PRICE_FULL_FIRST_HOUR = 200;
    final static int PRICE_ADDITIONAL_HOURS = 150;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("podaj oba czasy w formacie: hh:mm:ss");
        System.out.println("Podaj czas rozpoczęcia: ");
        String startStr = scanner.nextLine();
        System.out.println("Podaj czas zakończenia: ");
        String endStr = scanner.nextLine();

        final LocalTime start = LocalTime.parse(startStr);
        final LocalTime end = LocalTime.parse(endStr);
        Duration duration = Duration.between(start, end);
        // do 10 minut - za darmo - 1 krok
        // od 10 do 1/2h - 1 zł
        // powyżej 1/2 h do 1 h - 2 zł
        // powyżej 1 h - 2 zł plus 1,5 zł z dodatkową rozpoczętą godzinę
        // a in 10..15
        if (duration.getSeconds() < FREE_PERIOD) {
            System.out.println("Za darmo");
        } else if (duration.getSeconds() > FREE_PERIOD && duration.getSeconds() <= PAY_PERIOD_TO_HALF_HOUR) {
            System.out.println("Opłata " + PRICE_HALF_HOUR + " zł");
        } else if (duration.getSeconds() > PAY_PERIOD_TO_HALF_HOUR && duration.getSeconds() <= PAY_PERIOD_TO_HOUR) {
            System.out.println("Opłata " + PRICE_FULL_FIRST_HOUR + " zł");
        } else if (duration.getSeconds() > PAY_PERIOD_TO_HOUR) {
            System.out.println("Opłata "
                    + (PRICE_FULL_FIRST_HOUR
                    + calculateFullHours(duration.getSeconds() - PAY_PERIOD_TO_HOUR) * PRICE_ADDITIONAL_HOURS
            )
                    + " groszy");
        }
    }

    public static long calculateFullHours(long seconds){
        return seconds / PAY_PERIOD_TO_HOUR + (seconds % PAY_PERIOD_TO_HOUR > 0 ? 1 : 0);
    }
}
