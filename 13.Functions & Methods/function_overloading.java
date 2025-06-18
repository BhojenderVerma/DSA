import java.util.*;
public class function_overloading {
    // overloading using function parameter
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }


    // overloading using function datatypes
    public static int sum_d(int a, int b){
        return a+b;
    }

    public static float sum_d(float a, float b){ // this is for float value
        return a+b;
    }

    public static double sum_d(double a, double b,double c){ // this is for double type value
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5,4));
        System.out.println(sum(5,4,9));
        System.out.println(sum_d(4.5f,5.2f)); //using f bcz by defult any decimal ttaken as double in java 
        System.out.println(sum_d(5,4,9));

    }
}
