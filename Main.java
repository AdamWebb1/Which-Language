import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    static private FileReader reader = new FileReader("input.txt");
    private static HashMap<String, Integer> letterFrequencies = new HashMap<String, Integer>();
    
    /**
     * Constructor for objects of class Main
     */
    public Main(){
        
    }

    public static void main(String[] args) {
        System.out.print("--->");
        System.out.println(reader.data);
        
        System.out.println(getLetterFrequencies());
    }
    
    public static HashMap getLetterFrequencies(){
        for (int i = 0; i < reader.data.length(); i++){
            if (letterFrequencies.get(reader.data.charAt(i)) != null){
                letterFrequencies.put(Character.toString(reader.data.charAt(i)), letterFrequencies.get(Character.toString(reader.data.charAt(i))));
            }
        }
        return letterFrequencies;
    }
}
