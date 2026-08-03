/*  
    In a program ,input 3 numbers: A,B & C. You have to generate the output average of these numbers.   
*/

import java.util.*;

public class AVERAGE {
    public static void main( String args[]){
            Scanner sc = new Scanner ( System.in ) ;
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            double Avg = ( A + B + C ) / 3; 
            System.out.println(Avg);
    }
}
