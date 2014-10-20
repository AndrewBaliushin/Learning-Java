package innerclasses;

/*
 * innerclasses/exercise15
 *
 * Created by Andrew Baliushin on 20.10.14.
 *
 * Create a class with a non-default constructor (one with arguments) and no default
 * constructor (no "no-arg" constructor).
 * Create a second class that has a method that returns a reference to an object of the first class.
 * Create the object that you return by making an anonymous inner class that inherits from the first class.

 */


class ConstructionYard {

    private int releseYear = 2015;

    ConstructionYard(int newReleaseDate) {
        releseYear = newReleaseDate;
        System.out.println("Crysis hit economy. Date shifted to " + releseYear);
    }

    public void sayHi() {
        System.out.println("Hi there.");
    }
}

class SecondClass {
    public static ConstructionYard getRefToConsYard(int year) {
        return new ConstructionYard(year);
    }
}


public class Exercise15 {

    public static void main(String[] args) {
        ConstructionYard constYardObj = SecondClass.getRefToConsYard(1111);
        System.out.println(constYardObj);

        /*other way*/
        SecondClass sObj = new SecondClass();
        sObj.getRefToConsYard(2222).sayHi();

    }

}
