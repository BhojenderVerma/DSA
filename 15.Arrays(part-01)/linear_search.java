public class linear_search {
    public static int lin_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {45,55,56,65,5,7,3,10,8,9};
        int key = 10;
        int index_no = lin_search(numbers, key);
        if(index_no == -1){
            System.out.println("Index is NOT Founded!");
        }else{
            System.out.println("index number of given digit "+ key + " is : "+ index_no);
        }    
    }
}
