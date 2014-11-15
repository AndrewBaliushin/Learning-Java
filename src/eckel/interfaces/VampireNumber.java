import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is exercise from Thinking in Java:
 * A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half
 * the number of digits of the result. The digits are taken from the original nu,ber in any order. Pairs of trailing zeroes
 * are not allowed.
 * Write a program that find all the 4-digit vampire numbers.
 *
 * Output:
 1395 : 15 * 93
 1260 : 21 * 60
 1827 : 21 * 87
 2187 : 27 * 81
 1530 : 30 * 51
 1435 : 35 * 41
 6880 : 80 * 86
 End of program
 *
 * @author Andrew Baliushin
 */
class VampireNumber {


    /**
     * Check if numbers are without trailing zeroes.
     * @return boolean
     */
    private static boolean trailingZeroesCheck(int a, int b) {
        //cast both to string and convert to char array
        char[] charsA = ("" + a).toCharArray();
        char[] charsB = ("" + b).toCharArray();

        if (charsA[1] == 0 && charsB[1] == 0) return false;
        else return true;
    }

    /**
     * Check if multiplication of digits is 4-digit int
     * @param c input number after multiply
     * @return boolean
     */
    private static boolean checkLength (int c) {
        char[] charsC = ("" + c).toCharArray();
        if (charsC.length == 4) return true;
        else return false;
    }


    /**
     * Check if provided multiplication is vampire number for a & b
     * @param a first one
     * @param b second one
     * @param x multiplication
     * @return
     */
    private static boolean checkIfVampire (int a, int b, int x) {
        //cast to strings
        char[] charsAB = (a + "" + b).toCharArray();
        char[] charsX = ("" + x).toCharArray();

        Arrays.sort(charsAB);
        Arrays.sort(charsX);

        if (Arrays.equals(charsAB,charsX)) return true;
        else return false;
    }

    //not needed
    //public static List<Integer> vampList = new ArrayList<Integer>();

    /**
     * Main
     */
    public static void main (String[] args) {

        //create loop of all possible 2-digits numbers
        for (int a = 10; a <= 99; a++) {
            for (int b = a; b <=99; b++) {
                //check for zeroes
                if ( ! trailingZeroesCheck(a, b)) continue;

                //multiply and check if number is vampire
                int vampCandidate = a*b;
                if(checkLength(vampCandidate)) {
                    if(checkIfVampire(a, b, vampCandidate)) {
                        //vampList.add(vampCandidate);
                        System.out.print(vampCandidate);
                        System.out.println(" : " + a + " * " + b);
                    } else continue;
                } else continue;
            }
        }

        System.out.println("End of program");

    }
}
