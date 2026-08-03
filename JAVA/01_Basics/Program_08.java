/*
    Check whether a number is even or odd using the modulus operator.
*/

import java.util.Scanner;


public class Program_08 {
     public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter a :");
        int a = sc.nextInt();
        
        if ( a % 2 == 0){
                System.out.println(" A is Even.");
        } else {
            System.out.println("A id Odd");
        }
        
        
                               
           
           
    }
}
