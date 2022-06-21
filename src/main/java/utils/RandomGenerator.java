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
    public int getRandomNumber(int length) {
        Random random = new Random();
        int number = random.nextInt();
        return Integer.parseInt(Integer.toString(number).substring(0, length));
    }

    // Method generates random boolean values
    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
