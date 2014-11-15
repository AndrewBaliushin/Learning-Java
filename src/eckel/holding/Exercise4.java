package holding;

/*
 * From Eckel book
 *
 * Chapter "holding", Exercise 2
 *
 * Create a generator class that produces character names (as String objects) from your favorite movie
 * each time you call next(), and loops around to the beginning of the character list when it runs
 * out of names. Use this generator and fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet,
 * and a TreeSet, then print each container.
 *
 * Created by Andrew Baliushin on 21.10.14.
 */

import java.util.*;

class Ex4helper {
    private String[] favNames = {"Anna", "Bob", "Tom", "Han", "Chuwbaka", "Lea", "Luk", "Luk"};

    private ArrayList<String> arrListNames = new ArrayList<String>();
    private List<String> linkedListNames = new LinkedList<String>();
    private Set<String> hashSetNames = new HashSet<String>();
    private Set<String> linkedSetNames = new LinkedHashSet<String>();
    private Set<String> treeSetNames = new TreeSet<String>();

    Ex4helper() {
        generateCollections();
    }

    private void generateCollections() {
        for (String name : favNames) {
            arrListNames.add(name);
            linkedListNames.add(name);
            hashSetNames.add(name);
            linkedSetNames.add(name);
            treeSetNames.add(name);
        }
    }

    public void printAllCollections() {
        System.out.println(arrListNames);
        System.out.println(linkedListNames);
        System.out.println(hashSetNames);
        System.out.println(linkedSetNames);
        System.out.println(treeSetNames);
    }


}

public class Exercise4 {


    public static void main(String[] args) {
        Ex4helper helper = new Ex4helper();
        helper.printAllCollections();
    }
}

/*
Output:
[Anna, Bob, Tom, Han, Chuwbaka, Lea, Luk, Luk]
[Anna, Bob, Tom, Han, Chuwbaka, Lea, Luk, Luk]
[Tom, Luk, Bob, Han, Chuwbaka, Lea, Anna]
[Anna, Bob, Tom, Han, Chuwbaka, Lea, Luk]
[Anna, Bob, Chuwbaka, Han, Lea, Luk, Tom]
 */


