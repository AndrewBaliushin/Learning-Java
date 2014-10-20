package innerclasses;

/*
 * innerclasses/exercise3
 * from Eckel
 *
 * Modify Exercise 1 so that Outer has a private String field (initialized by constructor),
 * and Inner has a toString() method that displays this field. Create an object of type Inner
 * and display it.
 *
 * Created by Andrew Baliushin on 19.10.14.
 */


class Outer2 { //to prevent name collision with ex1

    private String message;

    Outer2 () {
        message = "This is Outer2";
    }

    class Inner {

        public void sayHello() {
            System.out.println("Hello, I am Inner");
        }

        public String toString() {
            return message;
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        Outer2 outerObj = new Outer2();
        outerObj.getInner().sayHello();

        Outer2.Inner innerObj = outerObj.getInner();

        System.out.println(innerObj.toString());

    }
}
/*
output:
Hello, I am Inner
 */
