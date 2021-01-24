package app;


public class PhoneNumberDemo {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = PhoneNumber.of("456-900-900");
        System.out.println(phoneNumber);
        phoneNumber = PhoneNumber.of("123456789");
        System.out.println(phoneNumber);
    }
}