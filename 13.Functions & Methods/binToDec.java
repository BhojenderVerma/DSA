public class binToDec {

    //using while loop
    public static void bintodec_while(int bin_num){
        int number = bin_num;
        int ld=0,pow=0,dec=0;
        while(bin_num > 0){
            ld = bin_num%10;
            dec= dec+ld*(int)Math.pow(2,pow);
            bin_num = bin_num/10;
            pow++;
        }
        System.out.println("bin to decimal of "+ number + " is : "+ dec);
    }

    // using for loop
    public static void bintodec_for(int bin_num){
        int number = bin_num;
        int dec=0,pow=0,ld=0;
        for(int i=0;bin_num>0;i++){
            ld=bin_num%10;
            bin_num=bin_num/10;
            // System.out.println("ld : "+ld);
            // System.out.println("n : "+n);
            dec= dec+ld *(int)Math.pow(2, pow);
            pow++;
            // System.out.println("dec : "+ dec);
        }
        System.out.println("bin to decimal of "+ number + " is : "+ dec);
    }
    public static void main(String args[]){
        
        bintodec_while(1000);
        bintodec_for(1000);
    }
}
