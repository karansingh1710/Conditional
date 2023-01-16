package Assignment.Conditional;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        if (length==breadth)
            System.out.println("It is a Square");
        else
            System.out.println("It is a Rectangle");
    }
}
