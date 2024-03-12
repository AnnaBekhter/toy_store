package org.example;

import java.util.Random;

public class Randomizer {
    private static Random random;

    private Randomizer() {
    }

    public static Random getInstance() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }

    public static int getNumber(int bound) {
        return getInstance().nextInt(bound) + 1;
    }

    public static void close() {
        random = null;
    }
}
