package Assignment.Conditional;

import java.util.Scanner;

public class PrintPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n=sc.nextInt();
            if (n<0){
                break;
            }
            System.out.println(n);
        }
        System.out.println("The number is negative and skipped");
    }
}
