package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Password password1 = new Password(5, true, true, true, true);
        ArrayList<Password> passwords = new ArrayList<Password>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            passwords.add(new Password(random.nextInt(1, 11), random.nextBoolean(), random.nextBoolean(), random.nextBoolean(), random.nextBoolean()));
        }
        System.out.println(passwords); 
    }
}