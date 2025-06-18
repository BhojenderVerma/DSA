public class binery_search {
    public static int bin_search(int numbers[],int key){
        int start = 0 , end = numbers.length -1;
        while(start <= end){
           int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = end-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // note for this array must be in sorted form 
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 14;
        System.out.println("the number "+ key + " is on index number " + bin_search(numbers, key));
        
    }
}
