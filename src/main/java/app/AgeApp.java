package app;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    public class AgeApp {
        static Scanner scanner = new Scanner(System.in);
        int count = 0;

        public static void main(String[] args) {
            System.out.println("Podaj datę w formacie yyyy-mm-dd:");
            String str = scanner.nextLine();
            final LocalDate date = LocalDate.parse(str);
            final LocalDate now = LocalDate.now();
            if (date.isBefore(now)) {
                System.out.println("Upłynęło: ");
                final Period period = Period.between(date, now);
                System.out.println("Lat: "+period.getYears());
                System.out.println("Miesięcy: "+period.getMonths());
                System.out.println("Dni: "+period.getDays());
            } else if (date.isAfter(now)) {
                System.out.println("Musi upłynąć jeszcze: ");
                final Period period = Period.between(now, date);
                System.out.println("Lat: "+period.getYears());
                System.out.println("Miesięcy: "+period.getMonths());
                System.out.println("Dni: "+period.getDays());
            } else {
                System.out.println("Wprowadzona data jest teraźniejszą datą.");
            }
        }
    }

