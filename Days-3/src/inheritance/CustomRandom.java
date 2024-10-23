package src.inheritance;

import java.util.Random;

public class CustomRandom extends Random {

    @Override
    public int nextInt(int bound) {
        return super.nextInt(bound) + 50;
    }

}
