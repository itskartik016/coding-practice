// Enter sum of first n natural numbers.

import java.util.*;

public class While_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range:");
        int n = sc.nextInt();       // takes input n 

        int Sum = 0;                // initially sum is zero.
        int i = 1;                  // i = iterator 

        while ( i <= n) {
            Sum = Sum + i;           // updates current sum
            // Sum += i;
            i++;                     // updates iterator
        }

        System.out.println(Sum);
    }
}
