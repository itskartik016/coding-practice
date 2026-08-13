// Print reverse of a number 

import java.util.*;

public class While_05 {
    public static void main(String[] args) {
        
        int n = 2052003;

        while( n > 0){
            int LastDigit = n % 10;     // remainder gives the last digit
            System.out.print(LastDigit + " ");
            n = n/10;    // n/=10;               // Last digit is removed and updated in this step.
        }
        System.out.println();
    }
}
