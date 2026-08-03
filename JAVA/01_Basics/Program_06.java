/*
    Swap Two Numbers Without Using a Third Variable (Using Arithmetic Operators)
*/

import java.util.*;


public class Program_06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();

        System.out.println("Enter b :");
        int b = sc.nextInt();


            System.out.println("Before Swapping:");
            System.out.println(" a =" + a);
            System.out.println(" b =" + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping:");
            System.out.println(" a =" + a);
            System.out.println(" b =" + b);

}    
