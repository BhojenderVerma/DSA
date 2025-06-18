import java.util.*;
public class oneToN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of N :");
        int N = sc.nextInt();
        int counter = 1;
        while(counter <= N){
            System.out.println(counter);
            counter++;
        }
    }
 }