import java.util.*;
public class function{
    public static int calculatesum(int num1,int num2){ // whatever i writen in function calculatesum these are called parameter or formal parmeter...
        return num1+num2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a : ");
        int a = sc.nextInt();
        System.out.print("enter value of b : ");
        int b = sc.nextInt();
        int sum = calculatesum(a,b); // here whatever i passed in calculatesum that is called argumnets or actual parameters...
        System.out.println(sum);
    }
} 