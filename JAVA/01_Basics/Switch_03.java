// Updated Switch statement.(new)

import java.util.*;

public class Switch_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Week Day:");
        String day = sc.nextLine();

        switch(day){

            case " saturday", " sunday" -> System.out.println("8 AM");
            case " monday" -> System.out.println("6 AM");
            default -> System.out.println(" 7 AM");
        }
    }
}
