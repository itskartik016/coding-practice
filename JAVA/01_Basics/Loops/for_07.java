// Interview style basic questions 

import java.util.*;

public class for_07 {
    public static void main(String[] args) {
        


        //Write a program that counts how many numbers between 1 and 100 are divisible by 7.

        // int count = 0;

        // for ( int i=1; i <=100; i++){

        //     if( i % 7 ==0){
        //         count++;
        //     }
        // }
        // System.out.println(count);
//====================================================================================================================================================


        // int count = 0;

        // for ( int i=1; i<=100; i++){

        //     if( i % 7 == 0){
        //         count++;
        //     }
        // }
        // System.out.println(count);
    //====================================================================================================================================================



        
        // //Take an integer and print it's table.

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number:");
        // int number = sc.nextInt();

        // for ( int i=1; i<=10; i++){

        //      System.out.println( number + " X" + i + " = " + ( number * i));
        //  }
    //====================================================================================================================================================


        // Reverse a number using a for loop

        int num = 12345;
        int reverse = 0;

        for( ; num !=0; num = num / 10){     // initialization is empty because it is already initialized above
            
            int lastdigit = num % 10;        // gives the last digit
            reverse = reverse * 10 + lastdigit; // saves number in reverse
        }
        System.out.println("Reversed Number :" + reverse);
        
    }
}
