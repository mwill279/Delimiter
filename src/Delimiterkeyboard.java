/*
    Malachi Williams
    
    This File Shows what the delimiter can do when scanning input from the 
    keyboard. The Scanner will take in the token up to the number than proceed
    to the next token cutting out any numbers from the string
*/
import java.util.*;
public class Delimiterkeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanning the keyboard input using default delimiter
        Scanner in = new Scanner(System.in);
        
        //use Keyboard for input
        System.out.print("input: ");
        String input = in.nextLine();
        
        //Scanning the string input for testing
        //using the delimter of anything other than letters upper and lower
        Scanner scan = new Scanner(input).useDelimiter("[^A-Za-z]+");
        
        System.out.println("Original text: " + input);
        System.out.print("Delimiter text: ");
        while(scan.hasNext()){
            System.out.print(scan.next() + " ");
        }
        System.out.println("");
        
        //closing scanners
        in.close();
        scan.close();
    }
    
}
