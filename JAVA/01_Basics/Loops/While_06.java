// Reverse the given number.

import java.util.*;

public class While_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0){
            int lastdigit = n % 10;          // gives last digit
            rev = (rev * 10) + lastdigit;   // formula 
            n = n / 10;                     // last digit is removed and updated.
        }
        System.out.println("Reverse of given number is :" + rev);
    }
}
