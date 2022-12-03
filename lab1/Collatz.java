/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
/**The Collatz sequence is defined as follows:
 If n is even, the next number is n/2.
 If n is odd, the next number is 3n + 1. If n is 1, the sequence is over.
 For example, suppose we start with 5.
 Since 5 is odd, the next number is 3x5 + 1 = 16.
 Since 16 is even, the next number is 8.
 Since 8 is even, the next number is 4.
 Since 4 is even the next number is 2.
 Since 2 is even, the next number is 1.
 At that point we’re done. The sequence was 5, 16, 8, 4, 2, 1.*/
public class Collatz {
    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            n = n / 2;
            return n;
        }
        else {
            n = 3 * n + 1;
            return n;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

