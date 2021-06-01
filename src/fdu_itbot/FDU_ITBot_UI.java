
package fdu_itbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lvall
 * 
 * FDU_ITBot_UI class
 *   handles all UI for ITBot
 *   Initial iteration
 *      input & output directly to console
 *   Could be a singleton pattern (for now), but maybe just keep it simple
 * 
 * Methods
 *    void outputToUser(String)  // ToDo - much later, check if write successful
 *    String getInputFromUser()      // raw string, delimited by newline

 */
public class FDU_ITBot_UI {
    
    BufferedReader reader;
    
    FDU_ITBot_UI () {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void outputToUser(String output) {
        System.out.println(output);
    }
    
    public String getInputFromUser() {
        String userInput;
        
        try {
            userInput = reader.readLine();
        }
        catch (Exception e) {
            // do nothing for now
            userInput = null;
        } 
        return userInput;
    }
}