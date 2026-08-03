public class Program_07 {
    public static void main(String[] args) {
        
        // Post Increment Operator
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
        System.out.println("=====================");

        // Pre Increment Operator
        int c = 5;
        int d = ++c;  // increases c to 6 and then store in d.
        System.out.println(c);
        System.out.println(d);
        System.out.println("=====================");


        int x = 8;
        System.out.println(++x); // Pre Increment Operator
        System.out.println(x++); // Post Increment Operator
        System.out.println(x);   
        System.out.println("=====================");
    }
}
