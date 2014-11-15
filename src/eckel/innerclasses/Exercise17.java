package innerclasses;

/*
 * innerclasses/exercise17
 *
 * Create a class containing a nested class. In main() create an instance of this class.
 *
 * Created by Andrew Baliushin on 20.10.14.
 */

class Nest {

    static class Nested {
        public static String hi = "Hi.";
    }
}

public class Exercise17 {

    static public void main(String[] args) {
        Nest.Nested nestedObj = new Nest.Nested();
        System.out.println(nestedObj.hi);

        System.out.println(Nest.Nested.hi); //also works
    }
}
/*
Output:
Hi.
Hi.
 */