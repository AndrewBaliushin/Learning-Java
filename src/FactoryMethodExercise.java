/*
 * /interfaces/exercise 13
 * from Eckel.
 *
 * Create a framework using Factory Methods that performs both coin tossing and dice tossing.
 *
 * 19.10.14
 *
 * By Andrew Baliushin
 */

import java.util.Random;


interface Tosser {
    String getTossResult();
}

interface TosserFactory {
    Tosser getTosser();
}

class Coin implements Tosser {
    @Override
    public String getTossResult() {
        return (Math.random() <= 0.5d) ? "Heads" : "Tails";
    }
}

class Dice implements Tosser {
    @Override
    public String getTossResult() {
        Random rand = new Random();
        return "Dice showed " + (rand.nextInt(6) + 1); //note: nextInt(n) -- n exclusive.
    }
}

class CoinFactory implements TosserFactory {
    @Override
    public Tosser getTosser() {
        return new Coin();
    }
}

class DiceFactory implements TosserFactory {
    @Override
    public Tosser getTosser() {
        return new Dice();
    }
}

public class FactoryMethodExercise {
    public static void main(String[] args) {

        Random rand = new Random();
        TosserFactory[] tosserFactoriesArray = {new CoinFactory(), new DiceFactory()};

        for (int i=1; i<20; i++) {
            TosserFactory randTosserFactory = tosserFactoriesArray[rand.nextInt(2)];
            Tosser randTosser = randTosserFactory.getTosser();
            System.out.println(randTosser.getTossResult());
        }
    }
}
/*
Output example:
Heads
Dice showed 1
Tails
Dice showed 4
Dice showed 6
 */