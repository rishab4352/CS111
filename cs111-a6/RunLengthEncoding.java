/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {

    // WRITE YOUR CODE HERE
    String encodedString="";
    int count=1,i=0;
    
    while (i<original.length()-1){
        if (original.charAt(i) == original.charAt(i+1)){
            count++;
            i++;
        }
        else if (i==0 && count ==1){
            encodedString+=original.charAt(i);
            i++;
        }
        else if (count==1){
            encodedString+=original.charAt(i);
            i++;
        }
        else{
            encodedString+=count;
            count=1;
            encodedString+=original.charAt(i);
            i++;
        }
    }
    if(count>1){
        encodedString+=count;
    }
    encodedString+=original.charAt(i);
    return encodedString;
    }
    
    public static String repeatString(String strng, int numTimes) {
        return new String(new char[numTimes]).replace("\0", strng);
  }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  {
        if(original.length() <= 1){
            return original;
        }
  
        if(Character.isLetter(original.charAt(0))){
            String beg = original.substring(0,1);
            String end = original.substring(1);
            return beg + decode(end);
        }
  
        else{
            char digit = original.charAt(0);
            String stringTorepeat =""+original.charAt(1);
            String end = original.substring(1);
            return repeatString(stringTorepeat,(digit-'0')-1) + decode(end);
        }
	// WRITE YOUR RECURSIVE CODE HERE
    }

    public static void main (String[] args) {
        System.out.println(RunLengthEncoding.decode(RunLengthEncoding.encode("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT")));
	// WRITE YOUR TEST CASES HERE to test your methods
    }
}
