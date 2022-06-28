package utils;

import java.util.Random;

public class RandomGenerator {

    // Method generates random strings
    public String getRandomString(int wordLength) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < wordLength; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public String getRandomSkype(int wordLength) {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder an = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            int index = (int)(alphanumeric.length()* Math.random());
            char randomChar = alphanumeric.charAt(index);
            an.append(randomChar);
        }
        return an.toString();
    }

    public String getRandomEmail(int length) {
        String email = getRandomString(length);
        return email.substring(0, 1).toUpperCase() + email.substring(1) + "@gmailtest.com";
    }

    // Method generates random numbers
    public int getRandomNumber(int length) {
        Random random = new Random();
        int number = Math.abs(random.nextInt());
        return Integer.parseInt(Integer.toString(number).substring(0, length));
    }

    // Method generates random boolean values
    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
