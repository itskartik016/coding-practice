// print character pattern:
/*
    A
    AB
    ABC
    ABCD
    ABCDE
*/

import java.util.*;

public class Pattern_05 {
    public static void main(String[] args) {
        
        int n = 5;
        char ch = 'A';

        // Outer loop
        for( int line = 1; line <= n; line++){

            // Inner loop
            for( int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }

            System.out.println("");
        }
    }
}
