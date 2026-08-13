// print numbers from 1 to n 

import java.util.*;

public class While_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range:");
        int n = sc.nextInt();                      // takes input n (range)

        int counter = 1;

        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
    }
}
