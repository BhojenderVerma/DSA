import java.util.*;
public class reverse_of_n{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        while(n > 0){
            int last_digit = n%10;
            System.out.print(last_digit);
            n  = n/10;
        }
        System.out.println();  
    }
}