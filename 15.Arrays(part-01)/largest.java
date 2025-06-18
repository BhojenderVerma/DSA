public class largest {
    public static int largest(int numbers[]){
        int largest_number = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest_number < numbers[i]){
                largest_number = numbers[i];
            }
        }
        return largest_number;
    }

    public static int minimum(int numbers[]){
        int min_number = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(min_number > numbers[i]){
                min_number = numbers[i];
            }
        }
        return min_number;
    }
    public static void main(String args[]){
        int numbers[] = {45,84,68,78,49,48,25,79,58,84};
        System.out.println("from the given array the largest is : "+ largest(numbers));
        System.out.println("from the given array the minimum is : "+ minimum(numbers));
    }
}
