import java.util.*;
public class factorial{
    public static int fact(int number){
        int f = 1;
        for(int i=1;i<=number;i++){
            f*=i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        int N_fact = fact(n);
        int R_fact = fact(r);
        int nmr = fact(n-r);
        int binomial_coff = (N_fact)/(R_fact*nmr);
        return binomial_coff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.print("enter value of r : ");
        int r = sc.nextInt();
        int answer = binomial(n, r);
        System.out.println("answer is : " + answer);
    }
}
