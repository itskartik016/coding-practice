/*
    In a program , input the side of a square and generate the output area of the square.
 */

import java.util.Scanner;

public class AreaOfSquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int side1 = sc.nextInt();
            int side2 = sc.nextInt();

            int area = side1 * side2;
            System.out.println(area);
            

        }
}
