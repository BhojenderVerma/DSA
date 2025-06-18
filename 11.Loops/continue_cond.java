import java.util.*;
public class continue_cond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%10 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}