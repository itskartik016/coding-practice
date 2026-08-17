// print inverted star pattern: 
/*
    *****
    ****
    ***
    **
    *
*/

import java.util.*;

public class Pattern_03 {
    public static void main(String[] args) {

        int n = 5;

        for ( int line = 1; line <= n; line++){                  // outer loop 
            for ( int star = 1; star <= n - line + 1; star++){   // Inner Loop
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
