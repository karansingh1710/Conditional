package Assignment.Conditional;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp=sc.nextInt();
        System.out.println("Enter selling price:");
        int sp=sc.nextInt();
        if (sp>cp){
            System.out.println("Profit="+(sp-cp));
        }
        else {
            System.out.println("Loss="+(cp-sp));
        }

    }
}
