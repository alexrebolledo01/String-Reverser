/* 
 * PROJECT:    String reverser
 * DATE:       May 15, 2018
 * AUTHOR:     Alex Rebolledo
 * NOTES:      Interview preparation
 */
package stringreverser;

/**
 * Reverses a string object using a StringBuilder.
 * @author Alex Rebolledo
 */
public class StringReverser {
    
    /**
     * Reverses any String object using a StringBuilder.
     * @param word
     * @return 
     */
    public StringBuilder reverseString(String word) {
        
        StringBuilder reverseBuilder = new StringBuilder();
        
        char[] wordCharArray = word.toCharArray();
        
        for (int counter = (wordCharArray.length); counter > 0; counter--) {
            System.out.println(wordCharArray[counter - 1]);
            
            reverseBuilder.append(wordCharArray[counter - 1]);
        }
        
        return reverseBuilder;
    }
}
