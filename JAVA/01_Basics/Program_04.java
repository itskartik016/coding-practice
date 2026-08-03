/* 
    Swap Two Numbers Using a Third Variable:
*/

import java.util.Scanner;

public class Program_04 {
    public static void main(String args[]){

        Scanner sc = new Scanner( System.in);

        System.out.println("Enter Number 1 :");
        int Num1 = sc.nextInt();

        System.out.println("Enter Number 2 :");
        int Num2 = sc.nextInt();


        System.out.println("Before Swapping:");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);

        int temp = Num1;
            Num1 = Num2;   // Swapping code
            Num2 = temp; 

        System.out.println("After Swapping:");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);

    }    
}
