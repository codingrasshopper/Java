
/**
 * Write a description of Hi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
public class Hi_indiffanguage {
    
    public void sayHello() {
        URLResource webpage = new URLResource("http://www.dukelearntoprogram.com/java/somefile.txt");
        for(String word: webpage.words() ) {
            System.out.println(word);
        }
    }

}
