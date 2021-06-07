
package fdu_itbot;

/**
 *
 * @author lvall
 */
public class FDU_ITBot_ParseUserInput {
    
    FDU_ITBot_ParseUserInput() {
        ; // null constructor for now
    }
    
    /**
     * String parseInput(String)
     * @params string to be parsed into key words
     * @return normalized string
     *   
     * future versions will be overloaded - 
     *   possibly to pass a list of key words
     * 
     * Requirements:
     *   Parse 1st word of user input only (additional text ignored)
     *   words delimited by any white space, leading white space ignored
     *   case insensitive
     */
    
    public String parseInput(String userInput) {
        // remove leading and trailing whitespace (string.trim)
        // normalize string to lower case
        // break into words separated by white space
        userInput = userInput.trim();
        userInput = userInput.toLowerCase();
        String[] stringWords = userInput.split("\\s+",2);
        return stringWords[0];
    }
}
