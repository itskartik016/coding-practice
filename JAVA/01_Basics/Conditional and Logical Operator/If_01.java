//Write a program to check whether a number is positive.

import java.util.Scanner;   

public class If_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int number = sc.nextInt();


        if(number >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        
    }
}
