package innerclasses;

/*
 * Create an interface containing nested class. Implement this interface and create an instance
 * of the nested class.
 *
 * Created by Andrew Baliushin on 20.10.14.
 */

interface NestedInterface {
    void someMethod();

    static class NestedClass {
        NestedClass () {
            System.out.println("I am nested class.");
        }

    }
}

class AnotherName implements NestedInterface {
    @Override
    public void someMethod() {

    }
}

public class Exercise20 {
    public static void main(String[] args) {
        NestedInterface.NestedClass nestedIntObj = new NestedInterface.NestedClass();

        AnotherName an = new AnotherName();

        NestedInterface.NestedClass ninc = new NestedInterface.NestedClass();

    }
}/*
Output
I am nested class.
I am nested class.

*/
