import java.util.*;
public class calculater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first integer :");
        int a = sc.nextInt();
        System.out.print("enter second integer :");
        int b = sc.nextInt();
        System.out.print("choose operater from +,-,*,/ : ");
        char operater = sc.next().charAt(0);

        switch(operater ){
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/':  System.out.println(a/b);
                break;
            case '%':  System.out.println(a%b);
                break;
            default:
                System.out.println("sorry buddy, my calculater not that much advance !");
        }

    }
}