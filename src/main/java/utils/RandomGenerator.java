package utils;

import java.util.Random;

public class RandomGenerator {

    // Method generates random strings
    public String getRandomString(int wordLength) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < wordLength; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    // Method generates random numbers
    public int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    // Method generates random boolean values
    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
