package holding;

/*
 * From Eckel book
 *
 * Chapter "holding", Exercise 2
 *
 * Modify SimpleCollection.java to use a Set for c
 *
 * Created by Andrew Baliushin on 20.10.14.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>() {
        };
        for (int i = 0; i < 10; i++) {
            c.add(i);
            c.add(i+2); //demonstrate how the Set works. Only unique added.
        }

        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
/*
Out:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
 */


/*

Original version

public class Exercise2 {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
*/
