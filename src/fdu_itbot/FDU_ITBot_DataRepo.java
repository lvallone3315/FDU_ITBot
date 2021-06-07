
package fdu_itbot;

/**
 * FDU_ITBot Database class
 *    stores all help responses & supports mapping of keywords to answers
 * 
 * @author lvall
 */
class MapKeywordToAnswer {
    int answerID;
    String keyword;
    
    MapKeywordToAnswer(int id, String key) {
        this.answerID = id;
        this.keyword = key;
    }
}
  
/**
 * FDU_ITBOT_DataRepo
 *   Database (private)
 *          structure - keyword, answer id (note multiple keywords could map to same answer ID)
 *          structure - answer id, answer (one-one mapping, could be just an array indexed by answer id)
 *          Notes
 *              Repo private & initially pre-populated
 *              future - write DB to a file or a real DB
 *              future - interfaces to update database (e.g. by file, format TBD)
 */

public class FDU_ITBot_DataRepo {
    
    public static int NO_RESULT = 99;  // visible externally as error return
    
    /*             Adding answers to DB
     * add new MapKeyWordToAnswer - same ID can be used for multiple keywords
     * if a new answer, add new answerText element
     *
     * Note: index into answerText must equal answerID in mapper (VERY BAD)
     *   ToDo: refactor to a data dictionary where answerID is an element
     */
    private static final MapKeywordToAnswer[] answerMap = {
        new MapKeywordToAnswer(0, "password"),
        new MapKeywordToAnswer(1, "answer2"),
        new MapKeywordToAnswer(0, "reset"),      
            
    };
    
    private static final String[] answerText = {
        "Please visit https://it.fdu.edu/how-to-change-your-fdu-netid-password/ \n" +
            "for detailed password change options & instructions\n" +
            " If you have further questions, please contact\n" +
            "   the University Technical Assistance Center (UTAC) at https://it.fdu.edu/ or at +1 973 443 8822",
        "Answer 2"
    };
    
    FDU_ITBot_DataRepo() {
        ; // null for now
    }
    
    /**
     * 
     * @param searchText - keyword to search in database
     * @return - index into answer database
     */
    int searchByKeyword(String searchText) {
        for (MapKeywordToAnswer key : answerMap) {
            if (key.keyword.equals(searchText))
                return key.answerID;            
        }
        // else keyword not found
        return NO_RESULT;
    }
    
    /**
     * 
     * @param answerID - index into answer database
     * @return - solution to users problem
     */
    String getAnswer(int answerID) {
        return answerText[answerID];
    } 
}