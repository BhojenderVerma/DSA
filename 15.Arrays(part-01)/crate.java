public class crate{
    public static void update(int number[]){
        for(int i=0;i<number.length;i++){
            number[i]+=1;
            System.out.println(number[i]);
        }
    }
    public static void main(String args[]){
        // int number[] = new int[50];
        int number[] = {45,89,75};

        update(number); //from update function

        // from our actual class but after update function the actual is also updated..but if we write it before update(number) it will give us actual/original number array
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

    }
}