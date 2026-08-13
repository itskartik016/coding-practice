// USE OF BREAK STATEMENT.
import java.util.*;

public class for_03 {
    public static void main(String[] args) {
       
        for( int i=1; i<=5; i++){
            if( i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
