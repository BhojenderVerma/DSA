import java.util.*;
public class isprime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        // prime(n);
        System.out.println(prime(n));
        // prime_optimize(n);
        System.out.println(prime_optimize(n));
        primeInRange(n);
    }
    public static boolean prime(int n){
        // cornor cases 
        if(n==1){
            return true;
        }
        for(int i=2;i<n;i++){
            // System.out.println(i);
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean prime_optimize(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        // int range = 0;
        for(int i=1;i<=n;i++){
            if(prime_optimize(i)){
                // range++;
                System.out.print(i+" ");
            }
        }System.out.println();
    }
}