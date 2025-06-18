// formula : rev = (rev *10) + last_digit

public class reverse_of_the_given_n{
    public static void main(String args[]){
        int n = 12345;
        int rev = 0;
        while(n > 0){
            int last_digit = n%10;
            rev = (rev *10)+ last_digit;
            n = n/10; 
            // System.out.print(rev);
        }
        System.out.println(rev);
    }
}