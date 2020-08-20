/*
    Malachi Williams
    
    This File Shows what the delimiter can do when scanning a File. 
    The Scanner will take in the token up to the number than proceed
    to the next token cutting out any numbers from the string
*/

import java.util.*;
import java.io.*;
public class DelimiterFile {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        //opening file in the source folder
        File inputFile = new File("input.txt");
        //Scanning File using default delimiter
        Scanner in = new Scanner(inputFile);
        
        System.out.print("original Text: ");
        while(in.hasNext()){
            System.out.print(in.next() + " ");
        }
        System.out.println("");
        
        //new scanner with new delimiter
        Scanner del = new Scanner(inputFile).useDelimiter("[^A-Za-z]+");
        
        System.out.print("Delimiter Text: ");
        while(del.hasNext()){
            System.out.print(del.next() + " ");
        }
        System.out.println("");
        
        //closing scanners
        in.close();
        del.close();
    }
}
