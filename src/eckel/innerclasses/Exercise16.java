package innerclasses;

/*
 * Created by Andrew Baliushin on 20.10.14
 *
 * innerclas/exercise16
 *
 * Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.
 *
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

class Unicycle implements Cycle {

    static public CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("I am riding on my unicycle");
    }
}

class Bicycle implements Cycle {

    static public CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("I am riding on my bicycle");
    }
}

class Tricycle implements Cycle {

    static public CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };

    @Override
    public void ride() {
        System.out.println("I am riding on my tricycle");
    }
}

//class UnicycleFactory implements CycleFactory {
//    @Override
//    public Cycle getCycle() {
//        return new Unicycle();
//    }
//}
//
//class BicycleFactory implements CycleFactory {
//    @Override
//    public Cycle getCycle() {
//        return new Bicycle();
//    }
//}
//
//class TricycleFactory implements CycleFactory {
//    @Override
//    public Cycle getCycle() {
//        return new Tricycle();
//    }
//}


public class Exercise16 {

    public static void main(String args[]) {
        Random rand = new Random();
        Cycle[] cyclesArray = {Bicycle.factory.getCycle(), Tricycle.factory.getCycle(),
                Unicycle.factory.getCycle()};

        for (int i=0; i<5; i++) {
            cyclesArray[rand.nextInt(3)].ride();
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
