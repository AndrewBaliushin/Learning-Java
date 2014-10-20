/*
 * /interfaces/exercise18
 * from Eckel
 *
 * Create a Cycle interface, with implementation Unicycle, Bicycle, and Tricycle. Create factories for each
 * type of Cycle, and code that uses these factories.
 *
 * Created by Andrew Baliushin on 19.10.14.
 */

import java.util.Random;

interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("I am riding on my unicycle");
    }
}

class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("I am riding on my bicycle");
    }
}

class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("I am riding on my tricycle");
    }
}

class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}


public class Exercise18 {

    public static void main(String args[]) {
        Random rand = new Random();
        CycleFactory[] factoriesArray = {new BicycleFactory(), new TricycleFactory(), new UnicycleFactory()};

        for (int i=0; i<5; i++) {
            factoriesArray[rand.nextInt(3)].getCycle().ride();
        }
    }
}
/*
I am riding on my bicycle
I am riding on my unicycle
I am riding on my bicycle
I am riding on my tricycle
I am riding on my unicycle
 */
