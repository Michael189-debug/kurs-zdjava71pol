package app;
//TODO Stwórz klasę typu ValueObject do przechowywania PESEL - zakres poprawności obejmuje liczbę cyfr = 11
//TODO w klasie PESEL metoda getBirthDate, która zwraca łańcuch z datą urodzin

//TODO stwórz klasę ValueObject do przechowywania moc silnika, liczby dodatnie i całkowite, ale ne większe niż 5000
//TODO w klasie utwórz metody getInHP() i getInkW() zwracająca mocą w KM  druga w kW

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO część 2: po java zaawansowana
//TODO Zmienić definicję obu klas, aby metody of 1. rzucały odpowiedni wyjątek 2. zwracały Optional z obiektem
public class PhoneNumber {
    private final String number;
    static Pattern phoneNumberPatter = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");

    static public boolean isValidPhoneNumber(String number){
        Matcher phoneNumberMatcher = phoneNumberPatter.matcher(number);
        return phoneNumberMatcher.matches();
    }
    private PhoneNumber(String number) {
        this.number = number;
    }

    public static PhoneNumber of(String number){
        if (isValidPhoneNumber(number)){
            return new PhoneNumber(number);
        } else {
            return null;
        }
    }

    public String get(){
        return number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}