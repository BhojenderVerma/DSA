// sum of N by using while loop 
import java.util.*;
public class sum_of_n{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("enter value of N for sum : ");
        int N = sc.nextInt();
        int counter = 1;
        while(counter<=N){
            sum += counter;
            counter++;
        }
        System.out.println("sum of N is : "+sum);
    }
}