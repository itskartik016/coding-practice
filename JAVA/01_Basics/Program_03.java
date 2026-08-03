/*
    Take two numbers as input and print:
        Addition =
        Subtraction =
        Multiplication =
        Division =
        Modulus =
*/

import java.util.Scanner;

public class Program_03 {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2:");        
        int num2 = sc.nextInt();

        int Addition = num1 + num2;
        int Subtraction = num1 - num2;
        int Multiplication = num1 * num2;
        int Division = num1 / num2;
        int Modulus = num1 % num2;

        System.out.println("Addition is :" + Addition);
        System.out.println("Subtraction is : " + Subtraction);
        System.out.println("Multiplation is : " + Multiplication);
        System.out.println("Division is :" + Division);
        System.out.println( "Modulus is :" + Modulus);

    }
}
