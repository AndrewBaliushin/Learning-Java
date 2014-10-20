package innerclasses;

/*
 * innerclass/exercise18
 * from Eckel
 *
 * Create a class containing an inner class that itself contains an inner class. Repeat this using nested classes.
 * Note the names of the .class
 *
 * Created by Andrew Baliushin on 20.10.14.
 */

class Container {
    class SubContainer {
        class SubSubContainer {

        }
    }
}

class NestContainer {
    static class NestSubContainer {
        static class NestSubSubContainer {

        }
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        Container c = new Container();
        Container.SubContainer sc = c.new SubContainer();
        Container.SubContainer.SubSubContainer ssc = sc.new SubSubContainer();

        NestContainer nc = new NestContainer();
        NestContainer.NestSubContainer.NestSubSubContainer nssc
                = new NestContainer.NestSubContainer.NestSubSubContainer();

    }
}
