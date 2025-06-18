import java.util.*;
public class break_cond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // while(true){
        //     System.out.println("enter you number : ");
        //     if(n%10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            System.out.println(n);
            if(n%10 == 0){
                System.out.println("you entered 10 so that we are stopping the loop!");
                break;
            }
        }while(true);
    }
}