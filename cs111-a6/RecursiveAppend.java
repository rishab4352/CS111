/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n > 0) {
            return original + appendNTimes(original, n-1);
        }
        return original;
	// WRITE YOUR CODE HERE
    }

    public static void main (String[] args) {
        System.out.println(appendNTimes("cat", 0));
        System.out.println(appendNTimes("cat", 1));
        System.out.println(appendNTimes("cat", 2));
	// WRITE TEST CASES HERE to test your method
    }
}
