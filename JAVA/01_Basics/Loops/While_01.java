// Print Hello World 100 times.

import java.util.*;
public class While_01 {
    public static void main(String args[]){

        int counter = 0;                              // Initialization
        
        while(counter < 100){
            System.out.println("Hello World!");
            counter++;                                 // updates initialized counter
        }

        System.out.println("Updated Hello World! 100 times");
    }    
}
