// Find the last digit of a number.

import java.util.Scanner;


public class Program_09 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int Number = sc.nextInt();

        int lastdigit = Number % 10 ;  // the modulus operator returns the remainder after division. Ex: 256 % 10 = 6
        System.out.println("Last digit is :" + lastdigit);



    }
    
}
