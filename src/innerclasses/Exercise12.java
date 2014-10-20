package innerclasses;

/*
 * innerclasses/exercise12
 *
 * Created by Andrew Baliushin on 20.10.2014
 *
 * Repeat Exercise 7 using an anonymous inner class.
 *
 * (Exercise 7: Create a class with a private field and a private method.
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method.
 * In a second outer-class method, create an object of the inner class and call its method, then show the
 * effect on the outer-class object.)
 *
 */

class Ex12Support {

    private String message = "Hello";

    private void sayHello() {
        System.out.println(message);
    }

    class Inner {

        public void modify(String newMessage) {
            message = newMessage;
            sayHello();
        }
    }

    public void callInnerMethod() {
        Inner innerObj = new Inner();
        innerObj.modify("Ok, private var is modified.");
    }
}

public class Exercise12 {

    public static void main(String[] args) {
        Ex12Support outerObj = new Ex12Support();
        outerObj.callInnerMethod();
    }
}
/*
output:
Ok, private var is modified.
 */
