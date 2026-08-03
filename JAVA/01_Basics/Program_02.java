/*
    Enter cost of 3 items from the user (using fload data type) - a pencil, a pen and a eraser.
     You have to output the total cost of the items back to ther user bill. 
    ( You can also try to add 18% GST to the items in the bill) 
 */

import java.util.*;

public class Program_02 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float GST = ( pencil + pen + eraser) * 0.18f;
        float Total = GST + (pencil + pen + eraser );

        System.out.println("Total price after GST is : " + Total );

    }    
}
