package innerclasses;

/*
 * innerclasses/exercise1
 * from Eckel
 *
 * Write a class named Outer that contains an inner class named Inner. Add a method
 * too Outer that returns an object of type Inner. In main(), create and initialize
 * a reference to an Inner.
 *
 * Created by Andrew Baliushin on 19.10.14.
 */


class Outer {

    class Inner {

        public void sayHello() {
            System.out.println("Hello, I am Inner");
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.getInner().sayHello();
    }
}
/*
output:
Hello, I am Inner
 */
