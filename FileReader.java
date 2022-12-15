
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Literally just reads files
 *
 * @author Adam Webb
 */
public class FileReader
{
    private File file;
    private Scanner scanner;
    public String data;
    /**
     * Constructor for objects of class FileReader
     */
    public FileReader(String fileName)
    {
        file = new File(fileName);
        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                data += line;
                data += "\n";
            }
            //IF YOU'RE HAVING ISSUES, DELETE THIS VVV
            data = data.substring(4, data.length());
            scanner.close();
        }  
        catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        
    }
    
    
}
