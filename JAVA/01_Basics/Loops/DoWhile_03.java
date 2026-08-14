// Keep entering numbers till user enters a multiple of 10 :

import java.util.*;

public class DoWhile_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter number:");
            int n = sc.nextInt();

            if( n % 10 == 0){
                break;
            }
        } while(true);
    }
}
