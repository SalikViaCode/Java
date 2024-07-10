package Conditional.java;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price of the product : ");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price of the product : ");
        int sp = sc.nextInt();
        if (sp==cp){
            System.out.println("There is neither profit nor loss");
        } else if (sp>cp) {
            int profit = sp-cp;
            System.out.println("Seller made profit of "+profit+" ");
        }
        else {
            int loss = cp - sp;
            System.out.println("Seller has loss of "+loss+" ");
        }
    }
}
