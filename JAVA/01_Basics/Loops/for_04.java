import java.util.*;

public class for_04 {
    public static void main(String[] args) {
      
        for( int i=1; i<=5; i++){
            if( i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}

// output: 
// 1
// 2
// 4 
// 5
