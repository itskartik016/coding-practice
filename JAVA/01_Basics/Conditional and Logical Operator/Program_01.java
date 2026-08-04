/* 
    Check if a student is eligible for an exam:
            Marks ≥ 40
            Attendance ≥ 75%
*/

import java.util.*;


public class Program_01 {
    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        System.out.println("Enter Attendance:");        
        int attendance = sc.nextInt();

            // Using Nested-if 
            if(marks >= 40){

                if(attendance>= 75){
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not Eligible: Attendance is low");
                }
            } else {
                System.out.println("Not Eligible : Marks is low");
            }

            // Using logical operator (&&)
            // if(marks>= 40 && attendance >= 75){
            //     System.out.println("Eligible");
            // } else {
            //     System.out.println("Not Eligible");
            // }

         
         sc.close();
    }    
}
