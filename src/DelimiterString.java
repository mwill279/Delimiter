/*
    Malachi Williams
    
    This File Shows what the delimiter can do when scanning an already created
    String. The Scanner will take in the token up to the number than proceed
    to the next token cutting out any numbers from the string
*/
import java.util.*;
public class DelimiterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String that will be use for scanning
        //feel free to modify for testing 
        String input = "123Hello123World123";
        
        
        //Scanning the string input for testing
        //using the delimter of anything other than letters upper and lower
        Scanner in = new Scanner(input).useDelimiter("[^A-Za-z]+");
        
        System.out.println("Original text: " + input);
        
        System.out.print("Delimiter: " );
        while(in.hasNext()){
            System.out.print(in.next() + " ");
        }
        System.out.println("");
        
        //closing scanners
        in.close();
    }
    
}
