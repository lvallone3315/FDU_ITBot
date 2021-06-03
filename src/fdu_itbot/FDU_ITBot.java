package fdu_itbot;

/**
 *
 * @author lvall
 */
public class FDU_ITBot {

    /**
     * @param args the command line arguments
     * Main class
     * Name & text in main class for now 
     *   (single instance, not much value to sending to a new class now, for multiple users need to refactor to a separate class)
     * Instantiates & calls UI to manage input & output
     */
    
    private final static String VERSION = "v0.1";
    private final static String WELCOME_MESSAGE = "Welcome to the FDU IT bot.\n  What is your name? ";
    private final static String INITIAL_QUERY_PART1 = "Hi ";
    private final static String INITIAL_QUERY_PART2 = "! How can I help you?";
    
    private static String userName;
    
    public static void main(String[] args) {
        // TODO code application logic here
        FDU_ITBot_UI ITBot_UI = new FDU_ITBot_UI();
        ITBot_UI.outputToUser("FDU IT Bot " + VERSION + "\n\n");
        ITBot_UI.outputToUser(WELCOME_MESSAGE);
        
            // get user's name from input device (e.g. console)
            // if name is greater than 24 chars, then truncate to 24 chars
            // spaces & non-printable characters are accepted
        String inputtedName = ITBot_UI.getInputFromUser();
        if (inputtedName.length() > 24) {
            userName = inputtedName.substring(0,24);
        }
        else {
            userName = inputtedName;
        }
        ITBot_UI.outputToUser(INITIAL_QUERY_PART1 + userName + INITIAL_QUERY_PART2);
        
        try {  // wait before exiting - so user can see screen
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            ; // do nothing for now
        }
    }  // end main 
}
