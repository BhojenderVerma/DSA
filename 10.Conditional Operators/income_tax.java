import java.util.*;
public class income_tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if(income < 500000){
            System.out.println(income);

        }else if (income >= 500000 || income <= 1000000){
            tax = (int) (0.2 * income);
            System.out.println(income);

        }else{
            tax = (int) (0.3 * income);
            System.out.println(income);
        }
        System.out.println("you need to pay : "+ tax + " as tax");
    }
}