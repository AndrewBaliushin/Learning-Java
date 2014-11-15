package innerclasses;

/*
 * innerclasses/exrecise5
 * from Eckel
 *
 * Created by Andrew Baliushin on 19.10.14.
 *
 * Create a class with an inner class. In a separate class make an instance of the inner class. *
 *
 */

class AnotherOuter {

    class Inner {
        Inner () {
            System.out.println("Hello, I am Inner class.");
        }
    }
}

public class Exercise5 {

    public static void main(String[] args) {
        AnotherOuter outerObj = new AnotherOuter();
        AnotherOuter.Inner innerObj = outerObj.new Inner();
    }
}
/*
output:
Hello, I am Inner class.
 */
