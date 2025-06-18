public class decToBin {
    public static void main(String args[]){
        // System.out.println(dectobin_while(9));
        dectobin_while(25);
    }
    public static void dectobin_while(int decimal){
        int my_num= decimal;
        int rem=0,pow=0,bin=0;
        while(decimal > 0){
            rem = decimal % 2;
            decimal = decimal/2;
            bin=bin+rem*(int)Math.pow(10,pow);
            // System.out.println(bin);
            pow++;
        }
        System.out.println("decimal to binery of "+ my_num+" is : "+bin);
    }
}
