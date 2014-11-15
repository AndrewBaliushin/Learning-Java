package innerclasses;

/**
 * innerclases/exercise11
 *
 * Created by Andrew Baliushin on 19.10.14.
 *
 * Create a private inner class that implements a public interface.
 * Write a method that returns a reference to an instance of the private inner class, upcast to the interface.
 * Show that the inner class is completely hidden by trying to downcast to it.
 *
 */

interface Port {
    void sayHelloInterface();
}

class Outer11 {
    private class Inner implements Port {

        @Override
        public void sayHelloInterface() {
            System.out.println("I am interface");
        }

        public void sayHello() {
            System.out.println("I am class");
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}

public class Exercise11 {
    public static void main(String[] args) {

        Outer11 outerObj = new Outer11();

        //Outer11.Inner outerObj = outerObj.getInner(); //This wont work. Inner class has private access.

        Port innerObj = outerObj.getInner(); //Works only with public interface

        //Outer11.Inner downcasted = (Outer11.Inner) innerObj; //Won't work either.

        innerObj.sayHelloInterface();

    }
}
