package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Password password1 = new Password(5, true, true, true, true);
        ArrayList<Password> passwords = new ArrayList<Password>();
        passwords.add(password1);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            passwords.add(new Password(random.nextInt(1, 11), random.nextBoolean(), random.nextBoolean(), random.nextBoolean(), random.nextBoolean()));
        }
        System.out.println(passwords); 

        //analysis of objects through evaluation of password strength
        for (Password password : passwords) {

            int score = 0;
            if (password.isNeedsUpperCase()) {
                score++;
            }
            if (password.isNeedsLowerCase()) {
                score++;
            }
            if (password.isNeedsNumber()) {
                score++;
            }
            if (password.isNeedsSpecialCharacter()) {
                score++;
            }
            if (password.getLength() >= 8) {
                score++;
            }
            if (score == 5) {
                System.out.println("Password " + password.getPassword() + " is strong");
            } else if (score >= 3) {
                System.out.println("Password " + password.getPassword() + "  is moderate");
            } else {
                System.out.println("Password " + password.getPassword() + " is weak");
            }
        }
    }
}