package src;

import src.inheritance.CustomRandom;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {

        Random random = new Random();
        int rnd = random.nextInt(5);
        System.out.println("Rnd : " + rnd);

        CustomRandom customRandom = new CustomRandom();
        int cusInt = customRandom.nextInt(5);
        System.out.println("Custom Random : " + cusInt);

    }

}
