package app;

import queue.StringQueue;

import java.util.Random;

public class QueueDemo {
    public static void main(String[] args) {
        StringQueue kolejkaSzczepien = new StringQueue();
        Random random = new Random();
        int count = 10;
        while (count-- > 0) {
            int c = 10 + random.nextInt(20);
            for (int i = 0; i < c; i++) {
                kolejkaSzczepien.insert(((char) ('A' + random.nextInt(26))) + "" + ((char) ('0' + random.nextInt(10))));
            }
            int k = 20 + random.nextInt(10);
            for (int i = 0; i < k; i++) {
                if (!kolejkaSzczepien.isEmpty()) {
                    System.out.println("Osoba " + kolejkaSzczepien.remove() + " zaszczepiona!");
                }
            }
            System.out.println("******Pozostało do zaszczepienia: " + kolejkaSzczepien.size());
        }
    }
}

