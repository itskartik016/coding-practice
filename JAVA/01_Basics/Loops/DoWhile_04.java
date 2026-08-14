// Display all numbers entered by user except multiples of 10:

import java.util.*;

public class DoWhile_04 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter No:");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;        // skips the print statement if a no. is multiple of 10 and jumps to the next iteration
            }

            System.out.println("No. was : " + n);
        } while(true);
    }
}
