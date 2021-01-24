package app;

import java.time.LocalTime;

public class MatrixDemo {
    public static void main(String[] args) throws InterruptedException {
        int count = 1000;
        while(count-- > 0){
            System.out.print(LocalTime.now().getSecond());
            Thread.sleep(200);
            System.out.println("\b\b");
        }
    }
}