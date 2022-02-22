/*************************************************************************
 *  Compilation:  javac ISBNChecksum.java
 *  Execution:    java ISBNChecksum 020131452
 *
 *  @author:
 *
 *  Takes a 9-digit integer as a command line argument, then computes
 *  and prints the checksum character
 *
 *  % java ISBNChecksum 020131452
 *  5
 *
 *  Print only the checksum character, nothing else.
 *
 *************************************************************************/

public class ISBNChecksum {

    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for ( int i =2; i<= 10; i ++){
            int digit = n % 10;
            sum= sum + i * digit;
            n = n/10;
        }
        if(sum % 11 ==1){
            System.out.println("X");
        }
        else if (sum % 11 ==0){
            System.out.println("0");
        }
        else {
            System.out.println(11-(sum % 11));
        }
    }
}