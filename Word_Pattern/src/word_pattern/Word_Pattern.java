/*
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 */
package word_pattern;
import java.util.*;
/**
 *
 * @author gopalakp
 */
public class Word_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result;
        String pattern = "wctg";
        String str = "cat ginger mary cate";
        result = wordPattern(pattern, str);
        System.out.println(result);
    }
    /**
     * @param pattern single word with pattern
     * @param str string which follows pattern
     * @return True if pattern matches
     */
    public static boolean wordPattern(String pattern, String str){
        String[] words = str.split("\\s+");
        Map<Character, String> map = new HashMap<>();
        for (int i=0; i < pattern.length(); i++){
            char pk = pattern.charAt(i);
            System.out.println(pk);
            System.out.println(words[i]);
            if (map.containsKey(pk)){
                if (!map.get(pk).equals(words[i]))
                    return false;               
            }
            else {
                if(map.containsValue(words[i]))
                    return false;
                map.put(pk, words[i]);
            }
        }   
    return true;
    }
    
}
