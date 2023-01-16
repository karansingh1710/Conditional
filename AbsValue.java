package Assignment.Conditional;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Integer");
        int num=sc.nextInt();
        if (num<0){
            num*=-1;
            System.out.println(num);
        }
        else {
            System.out.println(num);
        }
    }
}
