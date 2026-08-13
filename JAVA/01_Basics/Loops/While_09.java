// Loop in loop
import java.util.*;
public class While_09 {
    public static void main(String[] args) {
        
        int i = 1;
        while( i <= 4){                         // OUTER LOOP
            System.out.println("Chapter" + i); 

            int j = 1; 
            while( j <= 2){                     // INNER LOOP
                System.out.println("Page" + j);
                j++;
            }
            i++;
        }

        System.out.println("THE END " + i);
    }
}
